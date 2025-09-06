### Passing Test Input to Scanner
- Manually testing the program is often laborious. It's possible to automate 
the passing of input by, for example, passing the string to be read into a Scanner object. 
You'll find an example below of how to test a program automatically. The program first enters five strings, followed by the previously seen string. After that, we try to enter a new string. The string "six" should not appear in the word set.

- The test input can be given as a string to the Scanner object in the constructor.
Each line break in the test feed is marked on the string with a combination of a backslash and an n character "\n".
```java
String input = "one\n" + "two\n"  +
                "three\n" + "four\n" +
                "five\n" + "one\n"  +
                "six\n";

Scanner reader = new Scanner(input);
/* Passing a string to the constructor of the Scanner class replaces input read from the keyboard.
 As such, the content of the string variable input 'simulates' user input.
 A line break in the input is marked with \n.
Therefore, each part ending in an newline character in a given string input corresponds
 to one input given to the nextLine() command. */


ArrayList<String> read = new ArrayList<>();

while (true) {
    System.out.println("Enter an input: ");
    String line = reader.nextLine();
    if (read.contains(line)) {
        break;
    }

    read.add(line);
}

System.out.println("Thank you!");

if (read.contains("six")) {
    System.out.println("A value that should not have been added to the group was added to it.");



```
- When testing your program again manually, change the parameter Scanner object constructor to System.in, i.e., to the system's input stream. Alternatively, you can also change the test input, since we're dealing with a string.

- The working of the program should continue to be checked on-screen. The print output can be a little confusing at first, as the automated input is not visible on the screen at all. The ultimate aim is to also automate the checking of the correctness of the output so that the program can be tested and the test result analyzed with the "push of a button". We shall return to this in later sections.

