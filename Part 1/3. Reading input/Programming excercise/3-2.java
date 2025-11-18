// Write a program that asks the user to write a string. When the user has given a string (that is, written some text and pressed enter), the program must print the user's string three times (you can use the System.out.println command multiple times).
import java.util.Scanner;

public class main {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a massage :");
        String massage = scanner.nextLine();
        System.out.println(massage);
        System.out.println(massage);
        System.out.println(massage);
    }
}
