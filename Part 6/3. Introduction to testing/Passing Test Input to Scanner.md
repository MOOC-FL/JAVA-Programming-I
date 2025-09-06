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
