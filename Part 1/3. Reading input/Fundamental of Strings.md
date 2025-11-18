#### Fundamentals of Strings
- As you might have noticed, in programming we refer to "strings" rather than "text". The term "string" is shorthand for "string of characters" which describes how the computer sees text on a more fundamental level: as a sequence of individual characters.
- We've so far used strings in two ways. When practicing the print command, we passed the string to be printed to the print command in quotation marks, and when practicing reading input, we saved the string we read to a variable.
- In practice, variables are named containers that contain information of some specified type and have a name. A string variable is declared in a program by stating the type of the variable `(String)` and its name `(myString, for instance).` Typically a variable is also assigned a value during its declaration. You can assign a value by following the declaration with an equals sign followed by the value and a semicolon.
> A string variable called message that is assigned the value "Hello world!" is declared like this:
```java
String message = "Hello world!";
```
- When a variable is created, a specific container is made available within the program, the contents of which can later be referenced. Variables are referenced by their name. For instance, creating and printing a string variable is done as shown below:
```java
String message = "Hello world!";
System.out.println(message);
```
- A string enclosed in a programming language's quotation marks is called a "string literal", i.e., a string with a specified value.
- > A common programming mistake is trying to put quotation marks around variable names. If there were quotation marks around the string variable message, the program would print the text "message" instead of the "Hello world!" text held by the message variable.
  This is an excellent explanation of string fundamentals in programming! Let me summarize and expand on the key points:

#### Core Concepts of Strings

**What strings are:**
- Strings represent text in programming
- Short for "string of characters" - a sequence of individual characters
- Treated as a data type in many programming languages

**String Variables:**
```java
String message = "Hello world!";
```
- `String` - the data type
- `message` - the variable name
- `"Hello world!"` - the value (string literal)

**Common Mistakes:**
```java
String message = "Hello world!";
System.out.println("message");  // Wrong - prints "message"
System.out.println(message);    // Correct - prints "Hello world!"
```

#### Important Distinctions

1. **Variable vs. String Literal**
   - `message` (variable name) refers to the container holding the value
   - `"message"` (string literal) is the actual text "message"

2. **Declaration vs. Usage**
   - Declaration: `String message = "Hello world!";`
   - Usage: `System.out.println(message);`

#### Practical Applications

Strings are used for:
- User input/output
- Storing text data
- Displaying messages
- Processing text information
