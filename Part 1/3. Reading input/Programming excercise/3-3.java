// Write a program that prompts the user for their name with the message "What's your name?". When the user has written their name, the program has to print "Hi " followed by the user's name.


import java.util.Scanner;

public class main {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What`s your name?");
        String massage = scanner.nextLine();
        System.out.println("Hi "+massage);
 
    }
}
