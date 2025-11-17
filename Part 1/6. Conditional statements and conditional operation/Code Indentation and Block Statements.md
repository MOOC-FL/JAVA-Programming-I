#### Code Indentation and Block Statements
- A code block refers to a section enclosed by a pair of curly brackets. The source file containing the program includes the string public class, which is followed by the name of the program and the opening curly bracket of the block. The block ends in a closing curly bracket. In the picture below, the program block is highlighted.
- The recurring snippet public static void main(String[] args) in the programs begins a block, and the source code within it is executed when the program is run — this snippet is, in fact, the starting point of all programs. We actually have two blocks in the example above, as can be seen from the image below.
- Blocks define a program's structure and its bounds. A curly bracket must always have a matching pair: any code that's missing a closing (or opening) curly bracket is erroneous.
- A conditional statement also marks the start of a new code block.
- In addition to the defining program structure and functionality, block statements also have an effect on the readability of a program. Code living inside a block is indented. For example, any source code inside the block of a conditional statement is indented four spaces deeper than the if command that started the conditional statement. Four spaces can also be added by pressing the tab key (the key to the left of 'q'). When the block ends, i.e., when we encounter a } character, the indentation also ends. The } character is at the same level of indentation as the if-command that started the conditional statement.
> Automatic Code Indentation
Code in Java is indented either by four spaces or a single tab for each block. Use either spaces or tabs for indentation, not both. The indentation might break in some cases if you use both at the same time. NetBeans will help you with this if you hit the "alt + shift + f" (macOS "control + shift + f") key combination.

From now on the our program code needs to be indented correctly in the exercises as well. If the indentation is incorrect, the development environment will not accept the solution. You will see indentation errors highlighted in yellow in the test results.
Here is the text formatted into a clear Markdown document about code indentation and block statements.

### **Code Indentation and Block Statements**
#### **What is a Code Block?**
A **code block** refers to a section of code enclosed by a pair of curly brackets `{}`.
*   The source file begins with `public class`, followed by the program name and an opening curly bracket `{`.
*   The program block ends with a closing curly bracket `}`.
*   **Blocks define a program's structure and its bounds.**
*   **A curly bracket must always have a matching pair.** Code missing a closing or opening bracket is erroneous.
#### **Examples of Blocks**
**The Main Program Block:**
The recurring snippet `public static void main(String[] args)` begins a block. This is the starting point of all programs, and the code within it is executed when the program runs.
In a standard program, we typically have at least two blocks:
1.  The **class block** (defined by `public class ProgramName`)
2.  The **main method block** (defined by `public static void main`) nested inside it.
A **conditional statement** (like an `if` statement) also marks the start of a new code block.
#### **Indentation for Readability**
Block statements significantly affect the readability of a program. Code inside a block is indented according to these rules:
*   Code inside a block is indented **four spaces deeper** than the command that started the block.
*   Four spaces can be added by pressing the **Tab** key.
*   When the block ends (when we encounter a `}`), the indentation also ends.
*   The `}` character should be at the **same level of indentation** as the command that started the block.
#### **Examples: Incorrect vs. Correct Indentation**
**The example below is incorrectly indented:**
```java
if (number > 10) {
number = 9; // This line should be indented!
}
```
**The example below is correctly indented:**
```java
if (number > 10) {
    number = 9; // Properly indented with 4 spaces/tab
}
```
#### **Automatic Code Indentation**
*   Code in Java is indented either by **four spaces** or a **single tab** for each block.
*   **Use either spaces or tabs for indentation, not both.** Mixing them can break the indentation.
*   Most development environments, like NetBeans, can automatically format your code. Typically, you can use the key combination:
    *   **Windows/Linux:** `Alt + Shift + F`
    *   **macOS:** `Control + Shift + F`

#### **Indentation in Exercises**
From now on, program code **must be indented correctly** in the exercises. If the indentation is incorrect, the development environment will not accept the solution. You will see indentation errors highlighted in yellow in the test results.
**Example of an indentation error message:**
> *"There should have been 8 spaces at the beginning of line 8 - there were only 2."*
**How to fix:** In this case, you would fix the indentation by adding 6 more spaces to the beginning of line 8 (or replacing the existing indentation with a proper tab/4-space increment).



