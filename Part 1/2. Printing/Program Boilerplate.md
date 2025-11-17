#### Program Boilerplate
- In Java, our programs have to include some boilerplate code to function. This boilerplate, an example of which is shown below, for example tells the computer what your program is called. Below, the name of the program is Example. This name has to correspond to the name of the file that contains the source code (e.g. Example.java).
```java
public class Example {
    public static void main(String[] args) {

        System.out.println("Text to be printed");

    }
}
```
- Execution of the program starts from the line that follows `public static void main(string[] args)` `{`, and ends at the closing curly bracket `}`. 
- Commands are executed one line at a time. We'll learn what the terms `public class` and `public static void` mean later on.
- In the above example, `System.out.println("Text to be printed")` is the only command to be executed. Its output is:

> Examples in the Material and Code Templates
- The examples in the material will not always show the template, but you can assume that your program file always needs one. As such, the examples might be as short as a single line, such as the example below that illustrates the print command.
```java
System.out.println("Hello world");
```
> In reality, the above example, when written as a full Java program, looks like so:
```java
public class Example {
    public static void main(String[] args) {
        // Here goes the statements used by the program
        System.out.println("Hello world!");
    }
}
```
#### Printing Multiple Lines
- Programs are constructed command-by-command, where each command is placed on a new line. In the example below, the command System.out.println appears twice, which means that two print commands are being executed in the program.
```java
public class Ohjelma {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("... and the universe!");
    }
}
```
