package UserHotel;

public interface CustomerActions {
    // Method to view booking details
    void viewBookingDetails();

    // Method to reserve a room
    void reserveRoom(int roomId, int reservationId,String customerName, String checkInDate, String checkOutDate);
}

