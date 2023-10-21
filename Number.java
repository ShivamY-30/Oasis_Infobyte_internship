import java.util.*;

public class Number {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        boolean guessed = true;
        int no_of_attempts = 0;
        Random ran = new Random();
        int generated_num = ran.nextInt(100);

        // System.out.println(generated_num);
        while (guessed) {

            no_of_attempts++;
            System.out.printf("Guess Any number Between 1 to 100: ");
            int a = sc.nextInt();
            if (a == generated_num) {
                System.out.println("Congrates!! You Guessed Right Number");
                System.out.printf("You Guessed it in %d number of attempts ", no_of_attempts);
                guessed = false;
            } else {
                if (generated_num > a) {
                    System.out.printf("Guess the number higher than current guess %d", a);
                    System.out.println("");
                } else {
                    System.out.printf("Guess the number lower than current guess %d", a);
                    System.out.println("");
                }
            }
            

        }
    }
}
