#### Concatenation - Joining Strings Together
- The string to be printed can be formed from multiple strings using the + operator. For example, the program below prints "Hello world!" on one line.
- The same method can be used to join a string literal and the value of a string variable.
- We can do the same with any number of strings.
```java
public class Program {

    public static void main(String[] args) {
        String start = "My name is ";
        String end = ", James Bond";

        System.out.println(start + "Bond" + end);
    }
}
```
#### Reading Strings
- The `reader.nextLine();` command reads the user's input and returns a string.
- If we then want to use the string in the program, it must be saved to a string variable — `String message = scanner.nextLine();`. A value saved to a variable can be used repeatedly. In the example below, the user input is printed twice.
```java
//Introduce the Scanner tool used for reading
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //Create the tool for reading, assign it to variable caller "scanner
        Scanner scanner = new Scanner(System.in);

        //Print user a message "Write a message: "
        System.out.println("Write a message: ");

        //Read the user's string input, save it to program memory
        //"String message = (user input)"
        String message = scanner.nextLine();

        // Print the user input twice
        System.out.println(message);
        System.out.println(message);
    }
}
```


