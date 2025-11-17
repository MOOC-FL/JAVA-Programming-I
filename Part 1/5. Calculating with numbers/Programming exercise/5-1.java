//In the exercise template, implement a program that asks the user for the number of days. After that, the program prints the number of seconds in the given number of days.
// Earlier we learned to read an integer in the following manner
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.

        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(scanner.nextLine());
        int seconds = number*24*60*60 ;
        System.out.println("You gave " + seconds);

    }
}
