import java.util.Scanner;

public class OnlieSeatReservation {
    public static boolean[] seat = new boolean[10];

    public static void main(String args[]){
        boolean exit = true;
        Scanner sc = new Scanner(System.in);

        while(exit){
            System.out.println(" ");
            System.out.println("1: For checking seat Availablity ");
            System.out.println("2: For Reservation of seat");
            System.out.println("3: For Cancellation of seat");
            System.out.println("4: To Exit");
             System.out.println(" ");
        
          System.out.printf("Enter Your choice based on your requirement:");
         
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                 viewseat();
                 break;
                case 2:
                 seat_reservation();
                 break;
                case 3:
                 seat_cancellation();
                 break;
                case 4:
                exit = false;
                default:
                System.out.println("Thank You!");
                
            
            }
        }
    }
    public static void viewseat() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the seat Number to check the detail of the ticket:");
        int seatNumber = sc.nextInt();
        if (seatNumber < 0 || seatNumber > 10) {
            System.out.println("Invalid Seat Number! Please Enter a valid seat Number to check details");
        } else if (seat[seatNumber - 1] == false) {
            System.out.println("Ticket is not reserved");
        } else {
            System.out.println("Ticket is booked/Reserved");
        }
    }

    public static void seat_reservation() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the seat Number to Reserve the ticket:");
        int seatNumber = sc.nextInt();
        
      if (seatNumber < 0 || seatNumber > 10) {
            System.out.println("Invalid Seat Number! Please Enter a valid seat Number to check details");
      }else if(seat[seatNumber - 1]){
        System.out.println("Seat is already Reserved!");
      }else {
        seat[seatNumber - 1] = true;
        System.out.println("Seat is booked/Reserved for You");
      }
    }

    public static void seat_cancellation() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the seat Number to Reserve the ticket:");
        int seatNumber = sc.nextInt();
      if (seatNumber < 0 || seatNumber > 10) {
            System.out.println("Invalid Seat Number! Please Enter a valid seat Number to check details");
      }else if(seat[seatNumber - 1]){
        seat[seatNumber - 1] = false;
        System.out.println("Your Seat is succesfully cancelled!!");
      }
    }
}
