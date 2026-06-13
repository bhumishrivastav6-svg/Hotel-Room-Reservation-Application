public class Reservation {


    private Customer customer;
    private Room room;


    public Reservation(Customer customer, Room room){

        this.customer=customer;
        this.room=room;

        room.bookRoom();

    }


    public Room getRoom(){

        return room;

    }


    public Customer getCustomer(){

        return customer;

    }


    public void cancel(){

        room.cancelRoom();

    }


    public void displayReservation(){

        System.out.println(
        "Customer: "+customer.getName()+
        "\nPhone: "+customer.getPhone()+
        "\nRoom: "+room.getRoomNumber()
        );

    }

}