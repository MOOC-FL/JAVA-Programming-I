/*
Write a program that works as follows:

Sample output
Greetings! How are you doing?
Good thank you!
Oh, how interesting. Tell me more!
Well, there's really nothing to tell.
Thanks for sharing!
*/
import java.util.Scanner;

public class main {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String massage = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String massage2 = scanner.nextLine();
        System.out.println("Thanks for sharing!");
 
    }
}
