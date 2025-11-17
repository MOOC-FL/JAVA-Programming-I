### **Conditional Statements and Conditional Operations**

#### **Learning Objectives**

*   Become familiar with the idea of a **conditional statement**.
*   Know how to create a program containing **optional operations** through the use of conditional statements.
*   Become familiar with **comparison** and **logical operators** commonly used in conditional statements.
*   Know how to compare both **numbers and strings**, remembering the **equals-command for strings**.
*   Become familiar with the **order of execution** for a conditional statement.
*   Understand that the parsing of a conditional statement **stops at the first condition** whose statement evaluates to `true`.

***

#### **1. What is a Conditional Statement?**

A **conditional statement** is a fundamental programming concept that allows a program to decide and execute different blocks of code based on whether a specified condition is `true` or `false`. It introduces decision-making and branching logic into your programs.

#### **2. Enabling Optional Operations**

Conditional statements are the primary tool for creating programs with **optional operations**. They allow you to specify that certain pieces of code should only run under specific circumstances.

**Example Idea:**
*   "**If** it is raining, **then** bring an umbrella." (The operation "bring an umbrella" is optional and conditional).

#### **3. Operators in Conditional Statements**

To form conditions, we use special operators.

**Comparison Operators** (used to compare two values):

| Operator | Description           | Example  | Result  |
| :------- | :-------------------- | :------- | :------ |
| `==`     | Equal to              | `5 == 5` | `true`  |
| `!=`     | Not equal to          | `5 != 3` | `true`  |
| `>`      | Greater than          | `5 > 3`  | `true`  |
| `<`      | Less than             | `3 < 5`  | `true`  |
| `>=`     | Greater than or equal | `5 >= 5` | `true`  |
| `<=`     | Less than or equal    | `3 <= 5` | `true`  |

**Logical Operators** (used to combine multiple conditions):

| Operator | Description | Example                     | Result                                   |
| :------- | :---------- | :-------------------------- | :--------------------------------------- |
| `&&`     | Logical AND | `(5 > 3) && (2 < 4)`        | `true` (both must be true)             |
| `\|\|`   | Logical OR  | `(5 > 3) \|\| (2 > 4)`      | `true` (at least one must be true)     |
| `!`      | Logical NOT | `!(5 > 3)`                  | `false` (reverses the boolean outcome) |

#### **4. Comparing Numbers vs. Strings**

It's crucial to know how to compare different data types.

*   **Numbers:** Use standard comparison operators (`==`, `!=`, `<`, `>`, etc.).
    ```java
    int age = 25;
    if (age >= 18) {
        System.out.println("You are an adult.");
    }
    ```

*   **Strings:** **Do not use `==` for content comparison!** Use the `.equals()` method.
    *   **`==`** checks if two string variables reference the *exact same object* in memory.
    *   **`.equals()`** checks if the *content* of the two strings is the same.

    **Example:**
    ```java
    String name1 = "Alice";
    String name2 = "Alice";

    // Correct way to compare string content
    if (name1.equals(name2)) {
        System.out.println("The names are the same.");
    }

    // Incorrect for content comparison (may sometimes work but is unreliable)
    // if (name1 == name2) // Avoid this for string content!
    ```

#### **5. Order of Execution**

Conditional statements are typically evaluated from top to bottom. The program checks each condition in sequence.

#### **6. Stopping at the First True Condition**

In a chain of conditional statements (e.g., `if` -> `else if` -> `else`), the program will execute the code block of the **first condition that evaluates to `true`** and then **exit the entire conditional chain**, skipping all subsequent checks.

This is a critical performance and logic feature.

**Example:**
```java
int score = 85;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) { // This condition is true!
    System.out.println("Grade: B"); // This line is executed.
} else if (score >= 70) { // This is also true, but it is NOT checked because the first true condition was already found.
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
// Output: "Grade: B"
```
