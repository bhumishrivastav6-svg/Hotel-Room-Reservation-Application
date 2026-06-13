import java.util.Scanner;

import java.util.Scanner;


public class Main {


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);


        Hotel hotel = new Hotel();

        Reservation reservation = null;


        while(true){


            System.out.println("\n===== HOTEL ROOM RESERVATION SYSTEM =====");

            System.out.println("1. Display Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Generate Bill");
            System.out.println("5. Exit");


            System.out.print("Enter choice: ");

            int choice = sc.nextInt();



            switch(choice){


                case 1:

                    hotel.displayRooms();

                    break;



                case 2:


                    sc.nextLine();


                    System.out.print("Enter Customer Name: ");
                    String name=sc.nextLine();


                    System.out.print("Enter Phone Number: ");
                    String phone=sc.nextLine();



                    System.out.print("Enter Room Number: ");
                    int roomNo=sc.nextInt();



                    Room room = hotel.findRoom(roomNo);



                    if(room!=null && room.isAvailable()){


                        Customer customer =
                        new Customer(name,phone);


                        reservation =
                        new Reservation(customer,room);


                        System.out.println("Room Booked Successfully!");

                    }

                    else{

                        System.out.println("Room not available!");

                    }


                    break;




                case 3:


                    if(reservation!=null){

                        reservation.cancel();

                        System.out.println("Reservation Cancelled!");

                    }

                    else{

                        System.out.println("No reservation found");

                    }


                    break;




                case 4:


                    if(reservation!=null){


                        System.out.print("Enter number of days: ");

                        int days=sc.nextInt();


                        BillingService bill =
                        new BillingService();


                        double amount =
                        bill.calculateBill(
                        reservation.getRoom(),
                        days);


                        System.out.println(
                        "Total Bill: ₹"+amount
                        );


                    }

                    else{

                        System.out.println("No booking found");

                    }


                    break;




                case 5:

                    System.out.println("Thank you!");

                    System.exit(0);



                default:

                    System.out.println("Invalid choice");

            }


        }

    }

}
public class Main {


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);


        Hotel hotel = new Hotel();

        Reservation reservation = null;


        while(true){


            System.out.println("\n===== HOTEL ROOM RESERVATION SYSTEM =====");

            System.out.println("1. Display Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Generate Bill");
            System.out.println("5. Exit");


            System.out.print("Enter choice: ");

            int choice = sc.nextInt();



            switch(choice){


                case 1:

                    hotel.displayRooms();

                    break;



                case 2:


                    sc.nextLine();


                    System.out.print("Enter Customer Name: ");
                    String name=sc.nextLine();


                    System.out.print("Enter Phone Number: ");
                    String phone=sc.nextLine();



                    System.out.print("Enter Room Number: ");
                    int roomNo=sc.nextInt();



                    Room room = hotel.findRoom(roomNo);



                    if(room!=null && room.isAvailable()){


                        Customer customer =
                        new Customer(name,phone);


                        reservation =
                        new Reservation(customer,room);


                        System.out.println("Room Booked Successfully!");

                    }

                    else{

                        System.out.println("Room not available!");

                    }


                    break;




                case 3:


                    if(reservation!=null){

                        reservation.cancel();

                        System.out.println("Reservation Cancelled!");

                    }

                    else{

                        System.out.println("No reservation found");

                    }


                    break;




                case 4:


                    if(reservation!=null){


                        System.out.print("Enter number of days: ");

                        int days=sc.nextInt();


                        BillingService bill =
                        new BillingService();


                        double amount =
                        bill.calculateBill(
                        reservation.getRoom(),
                        days);


                        System.out.println(
                        "Total Bill: ₹"+amount
                        );


                    }

                    else{

                        System.out.println("No booking found");

                    }


                    break;




                case 5:

                    System.out.println("Thank you!");

                    System.exit(0);



                default:

                    System.out.println("Invalid choice");

            }


        }

    }

}