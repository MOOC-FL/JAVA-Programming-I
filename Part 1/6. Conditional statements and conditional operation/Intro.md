#### Introduction to conditional operation
- Our programs have so far been linear. In other words, the programs have executed from top to bottom without major surprises or conditional behavior. However, we usually want to add conditional logic to our programs. By this we mean functionality that's in one way or another dependent on the state of the program's variables.
- To branch the execution of a program based on user input, for example, we need to use something known as a **conditional statement.**
>  The simplest conditional statement looks something like this.
```java
System.out.println("Hello, world!");
if (true) {
    System.out.println("This code is unavoidable!");
}
```
- A conditional statement begins with the keyword `if` followed by parentheses. An expression is placed inside the parentheses, which is evaluated when the conditional statement is reached. The result of the evaluation is a boolean value. No evaluation occurred above. Instead, a boolean value was explicitly used in the conditional statement.
- The parentheses are followed by a block, which is defined inside opening- { and closing } curly brackets. The source code inside the block is executed if the expression inside the parentheses evaluates to true.
```java
int number = 11;
if (number > 10) {
    System.out.println("The number was greater than 10");
}
```
- If the expression in the conditional statement evaluates to true,
- the execution of the program progresses to the block defined by the conditional statement. In the example above, the conditional is "if the number in the variable is greater than 10". On the other hand, if the expression evaluates to false, the execution moves on to the statement after the closing curly bracket of the current conditional statement.
> NB! An if -statement is not followed by a semicolon since the statement doesn't end after the conditional.
### **Anatomy of a Basic Conditional Statement**
A conditional statement is built from specific components that work together to control the flow of a program.
#### **1. The `if` Keyword and Parentheses**
Every conditional statement begins with the keyword **`if`**. This keyword is immediately followed by a set of parentheses `()`.
```java
if () // This is the starting structure.
```
#### **2. The Condition (Expression Inside Parentheses)**
Inside the parentheses, you place an **expression**. The key point is that this expression must **evaluate to a boolean value** (`true` or `false`).
*   This expression can be a **boolean variable**.
*   It can be the result of a **comparison** (e.g., `age > 18`).
*   It can be the result of a **logical operation** (e.g., `isRaining && hasUmbrella`).
*   Or, as in the initial example, it can be an **explicit boolean value** (`true` or `false`) directly.

**Example with an explicit boolean value:**
```java
if (true) { // The condition is hardcoded to be true.
    System.out.println("This will always run!");
}
```
In this specific case, **no dynamic evaluation occurs** at runtime because the value is explicitly `true`. The program doesn't need to calculate anything; it just proceeds.
#### **3. The Code Block (Curly Brackets `{}`)**
After the closing parenthesis, we define a **block** of code. This block is enclosed by an opening curly bracket `{` and a closing curly bracket `}`.
```java
if (condition) {
    // This entire area inside the brackets is the "block".
}
```
#### **4. Execution Rule**
The fundamental rule is:
> The source code **inside the block** is executed **if and only if** the expression inside the parentheses evaluates to `true`.
**Complete Example Breakdown:**
```java
if (true) { // 1. Keyword 'if' and parentheses.
            // 2. Expression is the explicit value 'true'.
{           // 3. Opening curly bracket starts the block.
    System.out.println("Hello, World!"); // Code inside the block.
}           // 4. Closing curly bracket ends the block.
```
**Output:**
```
Hello, World!
```
**Why it works:** The condition is explicitly `true`, so the program executes the code within the associated block. If the condition were `false`, the block would be skipped entirely.
