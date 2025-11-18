/*
NB! The example output might align wrong on narrow displays. If you're using only a limited portion of the browser window, or your display is otherwise very narrow, try to stretch the display horizontally to see if the text aligns differently. The exercise expects the text to align as it does on wider displays.

Write a program that asks the user for a character's name and their job. The program then prints a short story.

The output must be as shown below — note, the name and job depend on the user's input.
*/
import java.util.Scanner;

public class main {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the main character called?" );
        String name = scanner.nextLine();
        System.out.println("What is their Job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+name+",who was a"+job);
        System.out.println("On the way to work, "+name+"reflected on life.");
        System.out.println("Perhaps,"+name+"will not be a "+job+"forever.");
    }
}
