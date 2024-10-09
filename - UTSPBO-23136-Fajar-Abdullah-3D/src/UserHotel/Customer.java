package UserHotel;

import Hotel.Reservation;
import Hotel.Room;

public class Customer implements CustomerActions {
    private Reservation reservation;
    private HotelAdmin admin;


    public Customer(HotelAdmin admin) {
        this.admin = admin;
        this.reservation = null;
    }


    @Override
    public void viewBookingDetails() {
        if (reservation != null) {
            System.out.println("Reservation Details:");
            System.out.println("Reservation ID: " + reservation.getReservationId());
            System.out.println("Room Type: " + reservation.getRoomType());
            System.out.println("Customer Name: " + reservation.getCustomerName());
            System.out.println("Check-in: " + reservation.getCheckInDate());
            System.out.println("Check-out: " + reservation.getCheckOutDate());
        } else {
            System.out.println("No reservation has been made yet.");
        }
    }


    @Override
    public void reserveRoom(int reservationId, int roomId, String customerName, String checkInDate, String checkOutDate) {
        Room room = admin.getRoom();
        if (room != null && room.isAvailable() && room.getRoomId() == roomId) {
            this.reservation = new Reservation(reservationId, roomId, room.getRoomType(), customerName, checkInDate, checkOutDate);
            room.setStatus("occupied");
            System.out.println("Room successfully reserved for " + customerName);
        } else {
            System.out.println("Room is not available or hasn't been registered.");
        }
    }


    public Reservation getReservation() {
        return reservation;
    }


    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
