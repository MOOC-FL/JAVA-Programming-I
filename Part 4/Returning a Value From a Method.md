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
#### Let's continue with the Person class and add a returnAgemethod that returns the person's age.
```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    // the added method
    public int returnAge() {
        return this.age;
    }
```
```java
public class Main {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");

        pekka.growOlder();
        pekka.growOlder();

        antti.growOlder();

        System.out.println("Pekka's age: " + pekka.returnAge());
        System.out.println("Antti's age: " + antti.returnAge());
        int combined = pekka.returnAge() + antti.returnAge();

        System.out.println("Pekka's and Antti's combined age " + combined + " years");
    }
}
```
```text
Sample output
Pekka's age 2 Antti's age 1

Pekka's and Antti's combined age 3 years
```
- [ ] As we came to notice, methods can contain source code in the same way as other parts of our program. Methods can have conditionals or loops, and other methods can also be called from them.
- [ ] Let's now write a method for the person that determines if the person is of legal age. The method Returns a boolean - either `true` or `false`:
```java
public class Person {
    // ...

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    /*
     The method could have been written more succinctly in the following way:

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    */
}
```
> And let's test it out:
```java
public static void main(String[] args) {
    Person pekka = new Person("Pekka");
    Person antti = new Person("Antti");

    int i = 0;
    while (i < 30) {
        pekka.growOlder();
        i = i + 1;
    }

    antti.growOlder();

    System.out.println("");

    if (antti.isOfLegalAge()) {
        System.out.print("of legal age: ");
        antti.printPerson();
    } else {
        System.out.print("underage: ");
        antti.printPerson();
    }

    if (pekka.isOfLegalAge()) {
        System.out.print("of legal age: ");
        pekka.printPerson();
    } else {
        System.out.print("underage: ");
        pekka.printPerson();
    }
}
```
```text
Sample output
under age: Antti, age 1 years of legal age: Pekka, age 30 years


```
- Let's fine-tune the solution a bit more. In its current form, a person can only be "printed" in a way that includes both the name and the age. Situations exist, however, where we may only want to know the name of an object. Let's write a separate method for this use case:

```java
public class Person {
    // ...

    public String getName() {
        return this.name;
    }
}
```
- [ ] The `getName` method Returns the instance variable `name` to the caller. The name of this method is somewhat strange. It is the convention in Java to name a method that Returns an instance variable exactly this way, ie, `getVariableName`. Such methods are often referred to as `"getters"`.
- [ ] Let's mold the main program to use the new "getter" method:
```java
public static void main(String[] args) {
    Person pekka = new Person("Pekka");
    Person antti = new Person("Antti");

    int i = 0;
    while (i < 30) {
        pekka.growOlder();
        i = i + 1;
    }

    antti.growOlder();

    System.out.println("");

    if (antti.isOfLegalAge()) {
        System.out.println(antti.getName() + " is of legal age");
    } else {
        System.out.println(antti.getName() + " is underage");
    }

    if (pekka.isOfLegalAge()) {
        System.out.println(pekka.getName() + " is of legal age");
    } else {
        System.out.println(pekka.getName() + " is underage ");
    }
}
```
```text
The print output is starting to turn out quite neat:
Sample output
Antti is Underage Pekka is of legal age
```
















