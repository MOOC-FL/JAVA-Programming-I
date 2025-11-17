/*
The table below describes how the grade for a particular course is determined. Write a program that gives a course grade according to the provided table.
points	grade
< 0	impossible!
0-49	failed
50-59	1
60-69	2
70-79	3
80-89	4
90-100	5
> 100	incredible!
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scanner.nextLine());
        if (grade < 0) {
            System.out.println("impossible");
        } else if (grade <= 49) {
            System.out.println("failed");
        } else if (grade <= 59) {
            System.out.println("1");
        } else if (grade <= 69) {
            System.out.println("2");
        } else if (grade <= 79) {
            System.out.println("3");
        } else if (grade <= 89) {
            System.out.println("4");
        } else if (grade <= 100) {
            System.out.println("5");
        } else if (grade > 100) {
            System.out.println("incredible");
        }
    }
}
