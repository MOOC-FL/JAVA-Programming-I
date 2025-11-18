#### Reading input
Learning Objectives
Learn to write a program that reads text written by a user.

Know what a "string" refers to in programming.

Know how to join (i.e., "concatenate") strings together. 
Here's a comprehensive guide to reading input in Java based on your learning objectives:
### Setting up Scanner

To read user input, you need to import and set up the Scanner tool:

```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input code goes here
        
        scanner.close(); // Remember to close the scanner when done
    }
}
```
### Basic Input Reading
**Reading a string:**
```java
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name);
```
### String Concatenation
**Joining strings together:**
```java
String firstName = "Ada";
String lastName = "Lovelace";
String fullName = firstName + " " + lastName;  // "Ada Lovelace"
// You can also concatenate directly in print statements
System.out.println("Hello, " + firstName + " " + lastName + "!");
```
### Multiple Input Types
While input is always read as string, Scanner can convert to other types:
```java
// Reading different data types
System.out.print("Enter your age: ");
int age = Integer.parseInt(scanner.nextLine());

System.out.print("Enter your height: ");
double height = Double.parseDouble(scanner.nextLine());

System.out.print("Enter your name: ");
String name = scanner.nextLine();
```
### Common Scanner Methods
- `nextLine()` - reads entire line as string
- `next()` - reads single word as string
- `nextInt()` - reads integer (but can cause issues with newlines)
- `nextDouble()` - reads double value

### Best Practice
**Using `nextLine()` for everything:**
```java
// Recommended approach to avoid input issues
System.out.print("Enter age: ");
int age = Integer.parseInt(scanner.nextLine());

System.out.print("Enter name: ");
String name = scanner.nextLine();
```
### Key Points to Remember

1. **Input is always string** - even numbers are initially read as strings
2. **Import Scanner** - always include `import java.util.Scanner;`
3. **Create Scanner object** - `Scanner scanner = new Scanner(System.in);`
4. **Close Scanner** - use `scanner.close()` when done reading input
5. **String concatenation** - use `+` operator to join strings
6. **Type conversion** - use methods like `Integer.parseInt()` to convert strings to other types
