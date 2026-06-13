public class Hotel {

    Room[][] rooms;


    public Hotel() {

        rooms = new Room[2][5];

        int number = 101;


        for(int i=0;i<2;i++) {

            for(int j=0;j<5;j++) {

                rooms[i][j] =
                new Room(number,"Deluxe",2500);

                number++;
            }
        }
    }


    public void displayRooms(){

        for(Room[] floor : rooms){

            for(Room r : floor){

                r.displayRoom();

            }
        }
    }


    public Room findRoom(int roomNo){

        for(Room[] floor : rooms){

            for(Room r : floor){

                if(r.getRoomNumber()==roomNo){

                    return r;
                }
            }
        }

        return null;
    }
}