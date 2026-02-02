#### Returning a Value From a Method
- A method can return a value. The methods we've created in our objects haven't so far returned anything. This has been marked by typing the keyword void in the method definition.
```java
public class Door {
    public void knock() {
        // ...
    }
}
```
- The keyword **void** means that the method does not return a value.
- If we want the method to return a value, we need to replace the `void` keyword with the type of the variable to be returned. In the following example, the Teacher class has a method `grade` that always returns an integer-type (`int`) variable (in this case, the value 10). The value is always returned with the **return** command:
```java
public class Teacher {
    public int grade() {
        return 10;
    }
}
```
- The method above returns a `int` type variable of value 10 when called. For the return value to be used, it needs to be assigned to a variable. This happens the same way as regular value assignment, ie, by using the equals sign:
```java
public static void main(String[] args) {
    Teacher teacher = new Teacher();

    int grading = teacher.grade();

    System.out.println("The grade received is " + grading);
}
```
```text
Sample output
The grade received is 10
```
- The method's return value is assigned to a variable of type `int` value just as any other int value would be. The return value could also be used to form part of an expression.
```java
public static void main(String[] args) {
    Teacher first = new Teacher();
    Teacher second = new Teacher();
    Teacher third = new Teacher();

    double average = (first.grade() + second.grade() + third.grade()) / 3.0;

    System.out.println("Grading average " + average);
}
```
```text
Grading average 10.0
```
- All the variables we've encountered so far can also be returned by a method. To sum:
> A method that Returns nothing has the `void` modifier as the type of variable to be returned.
```java
public void methodThatReturnsNothing() {
    // the method body
}
```
> A method that Returns an integer variable has the intmodifier as the type of variable to be returned.
```java
public int methodThatReturnsAnInteger() {
    // the method body, requires a return statement
}
```
> A method that returns a string has the Stringmodifier as the type of the variable to be returned
```java
public String methodThatReturnsAString() {
    // the method body, requires a return statement
}
```
> A method that returns a double-precision number has the doublemodifier as the type of the variable to be returned.
```java
public double methodThatReturnsADouble() {
    // the method body, requires a return statement
}
```

| Method Return Type | Modifier/Type | Method Signature Example | What It Returns |
|--------------------|---------------|--------------------------|-----------------|
| Integer            | `int`         | `public int methodThatReturnsAnInteger()` | A whole number (integer) |
| String             | `String`      | `public String methodThatReturnsAString()` | Text/character sequence |
| Double-precision number | `double`   | `public double methodThatReturnsADouble()` | Decimal number with double precision |

  - Each method **must** have a return statement that matches the declared return type
  - The method body must return a value of the specified type
  - `void` is used when a method doesn't return any value

**Example with return statements:**
```java
public int methodThatReturnsAnInteger() {
    return 42;  // Returns an integer
}

public String methodThatReturnsAString() {
    return "Hello";  // Returns a string
}

public double methodThatReturnsADouble() {
    return 3.14159;  // Returns a double
}
```














