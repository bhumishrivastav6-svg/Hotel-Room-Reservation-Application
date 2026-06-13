import java.util.Scanner;

public class QuickHotelTest {
    public static void main(String[] args) {
        // Creating 2 floors with 3 rooms each
        String[][] hotel = new String[2][3];
        
        // Initialize all rooms as "Available"
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                hotel[i][j] = "Available";
            }
        }
        
        // Display initial status
        System.out.println("=== HOTEL ROOM STATUS ===");
        for(int i=0; i<2; i++) {
            System.out.print("Floor " + (i+1) + ": ");
            for(int j=0; j<3; j++) {
                System.out.print("[Room " + (j+1) + ": " + hotel[i][j] + "] ");
            }
            System.out.println();
        }
        
        // Booking room on Floor 1, Room 2
        System.out.println("\n--- Booking Room: Floor 1, Room 2 ---");
        hotel[0][1] = "Occupied";
        
        // Display updated status
        System.out.println("\n=== UPDATED ROOM STATUS ===");
        for(int i=0; i<2; i++) {
            System.out.print("Floor " + (i+1) + ": ");
            for(int j=0; j<3; j++) {
                System.out.print("[Room " + (j+1) + ": " + hotel[i][j] + "] ");
            }
            System.out.println();
        }
        
        // Calculate bill for 3 days at 2000 per day
        int days = 3;
        double rate = 2000.0;
        double total = days * rate;
        System.out.println("\n--- BILLING ---");
        System.out.println("Room Rate: Rs." + rate + "/day");
        System.out.println("Days Stayed: " + days);
        System.out.println("Total Bill: Rs." + total);
    }
}
