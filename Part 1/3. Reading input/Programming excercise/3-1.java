/*
Write a program that asks the user to write a string. When the user has provided a string (i.e., written some text and pressed the enter key), the program should print the string that was provided by the user
*/
import java.util.Scanner;

public class main {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a massage :");
        String massage = scanner.nextLine();
        System.out.println(massage);
    }
}
