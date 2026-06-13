public class BillingService implements Service {


    @Override
    public double calculateBill(Room room, int days) {


        return room.getPrice() * days;

    }

}