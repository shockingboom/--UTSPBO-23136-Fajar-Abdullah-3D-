package Hotel;

public class Room {
    private int roomId;
    private String roomType;
    private boolean isAvailable;


    public Room(int roomId, String roomType) {
        setRoomId(roomId);
        setRoomType(roomType);
        this.isAvailable = true; 
    }


    public int getRoomId() {
        return roomId;
    }


    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }


    public String getRoomType() {
        return roomType;
    }


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setStatus(String status) {
        this.isAvailable = !status.equals("occupied");
    }
}
