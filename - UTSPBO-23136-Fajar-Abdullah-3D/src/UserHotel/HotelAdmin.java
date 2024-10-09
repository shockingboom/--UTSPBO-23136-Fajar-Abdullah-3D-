package UserHotel;

import Hotel.Room;

public class HotelAdmin implements AdminActions {
    private Room room;


    public HotelAdmin() {
        this.room = null;
    }


    @Override
    public void checkRoomAvailability() {
        if (room != null) {
            String status = room.isAvailable() ? "Available" : "Occupied";
            System.out.println("Room " + room.getRoomId() + ": " + room.getRoomType() + " - " + status);
        } else {
            System.out.println("No room has been registered.");
        }
    }


    @Override
    public void addRoom(int roomId, String roomType) {
        if (room == null) {
            this.room = new Room(roomId, roomType);
            System.out.println("Room " + roomType + " has been successfully added.");
        } else {
            System.out.println("A room is already registered.");
        }
    }


    public Room getRoom() {
        return room;
    }


    public void setRoom(Room room) {
        this.room = room;
    }
}
