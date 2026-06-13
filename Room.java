public class Room {

    private int roomNumber;
    private String roomType;
    private boolean available;
    private double price;

    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getPrice() {
        return price;
    }


    public void bookRoom() {
        available = false;
    }


    public void cancelRoom() {
        available = true;
    }


    public void displayRoom() {

        System.out.println(
                "Room No: " + roomNumber +
                " | Type: " + roomType +
                " | Price: ₹" + price +
                " | Status: " +
                (available ? "Available" : "Booked")
        );
    }
}