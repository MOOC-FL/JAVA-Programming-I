#### Expression and Statement
- An expression is a combination of values ​​that is turned into another value through a calculation or evaluation. The statement below includes the expression 1 + 1 + 3 * 2 + 5, which is evaluated prior to its assignment to the variable.
```java
int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
```
The evaluation of an expression is always performed before its value is assigned to a variable. As such, the calculation "1 + 1 + 3 * 2 + 5" in the example above is performed before the result is assigned to the variable.
An expression is evaluated where it occurs in the program's source code. As such, the evaluation can occur within a print statement, if the expression is used in calculating the value of the print statement's parameter.
```java
int first = 2;
int second = 4;
```
System.out.println(first + second); // prints 6
System.out.println(2 + second - first - second); // prints 0
An expression does not change the value stored in a variable unless the expression's result is assigned to a variable or used as a parameter, for instance, in printing.
```java
int first = 2;
int second = 4;
```
```
// the expression below does not even work, since
// the result is not assigned to any variable
// or given as a parameter to a print statement
first + second;
```
# Expression and Statement

## What is an Expression?

An **expression** is a combination of values that is turned into another value through a calculation or evaluation.

### Example of Expression in Assignment
```java
int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
```
- The expression `1 + 1 + 3 * 2 + 5` is evaluated first
- The result is then assigned to the variable `calculationWithoutParentheses`

## Key Characteristics of Expressions

### 1. Evaluation Before Assignment
The evaluation of an expression is always performed **before** its value is assigned to a variable or used elsewhere.

### 2. Expressions Can Occur Anywhere
An expression is evaluated where it occurs in the program's source code, including within print statements:

```java
int first = 2;
int second = 4;

System.out.println(first + second); // prints 6
System.out.println(2 + second - first - second); // prints 0
```

**Step-by-step evaluation of the second print statement:**
1. `2 + second` = `2 + 4` = `6`
2. `6 - first` = `6 - 2` = `4`
3. `4 - second` = `4 - 4` = `0`

### 3. Expressions Don't Change Variables (Unless Assigned)
An expression by itself does **not** change the value stored in a variable unless:
- The result is **assigned to a variable**
- The result is used as a **parameter** (e.g., in printing)

## Important Distinction

### Valid Usage (Expression with Purpose)
```java
int first = 2;
int second = 4;

// Expression used in assignment
int result = first + second;

// Expression used as print parameter
System.out.println(first + second);
```
### Invalid Usage (Expression Without Purpose)
```java
int first = 2;
int second = 4;
// This expression DOES NOT WORK
// The result is not assigned or used
first + second;  // ERROR: Not a statement
```
### Arithmetic Expressions
```java
int a = 5 + 3 * 2;        // Evaluates to 11
double b = (10.0 / 3);    // Evaluates to 3.333...
```
### Comparison Expressions
```java
boolean isGreater = (5 > 3);  // Evaluates to true
boolean isEqual = (4 == 4);   // Evaluates to true
```
### Complex Expressions
```java
int x = 5, y = 3, z = 2;
int result = (x + y) * z + x / y;  // (8 * 2) + 1 = 17
```
## Expression vs Statement
| Expression | Statement |
|------------|-----------|
| Produces a value | Performs an action |
| Can be part of larger expressions | Standalone unit of execution |
| `5 + 3` | `int x = 5 + 3;` |
| `x > y` | `if (x > y) { ... }` |
| `firstName + " " + lastName` | `System.out.println(firstName + " " + lastName);` |
## Best Practices
- Use parentheses to make complex expressions clear
- Break very complex expressions into multiple steps
- Always ensure expressions serve a purpose (assignment or parameter)
- Test expressions with sample values to verify they evaluate as expected
