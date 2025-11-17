// Write a program that prompts the user for an integer and informs the user whether or not it is positive (greater than zero).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        if (number >= 0) {
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is Negative.");
        }
    }
}

