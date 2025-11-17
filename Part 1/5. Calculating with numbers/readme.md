# Calculating with Numbers

## Learning Objectives

- Learn to perform calculations with the help of variables
- Know how to form printable statements including both calculations (expressions) and strings

## Basic Mathematical Operations

| Operator | Operation | Example | Result |
|----------|-----------|---------|---------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division | `6 / 3` | `2` |

## Operator Precedence

The precedence follows standard mathematical rules:

1. **Parentheses** `()` have the highest priority
2. **Multiplication** `*` and **Division** `/` are calculated next
3. **Addition** `+` and **Subtraction** `-` are calculated last

Operations are performed from left to right when operators have equal precedence.

## Code Examples

### Basic Calculations with Variables
```java
int a = 5;
int b = 3;
int c = 2;

int result1 = a + b * c;      // 5 + (3 * 2) = 11
int result2 = (a + b) * c;    // (5 + 3) * 2 = 16
int result3 = a * b / c;      // (5 * 3) / 2 = 7
```

### Combining Calculations and Strings in Print Statements
```java
int x = 10;
int y = 4;

// Simple calculations in print statements
System.out.println("Sum: " + (x + y));        // "Sum: 14"
System.out.println("Product: " + (x * y));    // "Product: 40"
System.out.println("Average: " + ((x + y) / 2)); // "Average: 7"

// More complex expressions
System.out.println("Result: " + (x * 2 + y / 2)); // "Result: 22"
```

### Precedence Examples
```java
int result;

result = 2 + 3 * 4;       // 2 + 12 = 14 (multiplication first)
result = (2 + 3) * 4;     // 5 * 4 = 20 (parentheses first)
result = 10 - 4 / 2;      // 10 - 2 = 8 (division first)
result = 8 + 6 / 2 * 3;   // 8 + 3 * 3 = 8 + 9 = 17
```

## Important Notes

- **Integer Division**: When dividing integers, the result is also an integer (decimal part is truncated)
  ```java
  int division = 7 / 2;    // Result: 3 (not 3.5)
  ```
- **String Concatenation**: The `+` operator can mean addition or string concatenation depending on context
  ```java
  System.out.println("Value: " + 5 + 3);   // "Value: 53" (concatenation)
  System.out.println("Value: " + (5 + 3)); // "Value: 8" (addition first)
  ```
- **Use Parentheses**: When in doubt, use parentheses to make the order of operations explicit

## Practical Application
```java
// Calculate area of a rectangle
int length = 8;
int width = 5;
int area = length * width;
System.out.println("Area: " + area);  // "Area: 40"

// Calculate average of three numbers
int num1 = 15, num2 = 25, num3 = 35;
double average = (num1 + num2 + num3) / 3.0;
System.out.println("Average: " + average);  // "Average: 25.0"
```
