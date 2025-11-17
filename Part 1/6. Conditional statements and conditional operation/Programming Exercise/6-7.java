// Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are the same, then the program informs us about this as well.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:?");
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:?");
        int Second_number = Integer.valueOf(scanner.nextLine());
        if (first_number > Second_number) {
            System.out.println("Greater number is :"+  first_number);
        } else if (first_number < Second_number) {
            System.out.println("Greater number is :"+  Second_number);
        } else if (first_number == Second_number) {
            System.out.println("The numbers are equal!");
        }
    }
}
