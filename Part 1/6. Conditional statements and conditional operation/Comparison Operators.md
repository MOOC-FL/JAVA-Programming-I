# Comparison Operators
## Operator Reference
| Operator | Description | Example |
|----------|-------------|---------|
| `>` | greater than | `a > b` |
| `>=` | greater than or equal to | `a >= b` |
| `<` | less than | `a < b` |
| `<=` | less than or equal to | `a <= b` |
| `==` | equal to | `a == b` |
| `!=` | not equal to | `a != b` |
## Code Example
```java
int number = 55;

if (number != 0) {
    System.out.println("The number is not equal to 0");
}

if (number >= 1000) {
    System.out.println("The number is at least 1000");
} else {
    System.out.println("The number is less than 1000");
}
```
## Sample Output
```
The number is not equal to 0
The number is less than 1000
```
## Key Points
- **Return boolean values**: All comparison operators evaluate to either `true` or `false`
- **Numerical comparisons**: Used primarily with numeric data types (`int`, `double`, etc.)
- **String comparisons**: Use `.equals()` method for strings, not `==`
- **Conditional execution**: The code inside the `if` block only executes when the condition is `true`
## Common Usage Patterns
```java
// Checking ranges
if (age >= 18 && age <= 65) {
    System.out.println("Working age adult");
}

// Equality checks
if (score == 100) {
    System.out.println("Perfect score!");
}

// Inequality checks  
if (temperature != 0) {
    System.out.println("Not freezing");
}
```
