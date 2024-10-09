package Hotel;

public class Reservation extends Room {
    private int reservationId;
    private String customerName;
    private String checkInDate;
    private String checkOutDate;


    public Reservation(int reservationId, int roomId, String roomType, String customerName, String checkInDate, String checkOutDate) {
        super(roomId, roomType); 
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }


    public int getReservationId() {
        return reservationId;
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getCheckInDate() {
        return checkInDate;
    }


    public String getCheckOutDate() {
        return checkOutDate;
    }


    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }


    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}

