# Precedence and Parentheses

## Controlling Order of Operations

You can affect the order of operations by using parentheses. Operations within parentheses are performed before those outside them.

## Code Examples

### With vs Without Parentheses
```java
int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
System.out.println(calculationWithParentheses); // prints 23

int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
System.out.println(calculationWithoutParentheses); // prints 13
```

### Step-by-Step Breakdown

**With Parentheses:**
```java
int calculationWithParentheses = (1 + 1);
System.out.println(calculationWithParentheses); // prints 2
calculationWithParentheses = calculationWithParentheses + 3 * (2 + 5);
System.out.println(calculationWithParentheses); // prints 23
```

**Step-by-step calculation:**
1. `(1 + 1)` = `2`
2. `(2 + 5)` = `7`
3. `3 * 7` = `21`
4. `2 + 21` = `23`

**Without Parentheses:**
```java
int calculationWithoutParentheses = 1 + 1;
calculationWithoutParentheses = calculationWithoutParentheses + 3 * 2;
calculationWithoutParentheses = calculationWithoutParentheses + 5;
System.out.println(calculationWithoutParentheses); // prints 13
```

**Step-by-step calculation:**
1. `1 + 1` = `2`
2. `3 * 2` = `6` (multiplication before addition)
3. `2 + 6` = `8`
4. `8 + 5` = `13`

## Precedence Rules Summary

1. **Parentheses** `()` - Highest priority
2. **Multiplication** `*` and **Division** `/`
3. **Addition** `+` and **Subtraction** `-`

## Why Use Parentheses?

- **Clarity**: Makes the intended order of operations explicit
- **Control**: Overrides the default operator precedence
- **Readability**: Helps other programmers understand your intent
- **Prevention**: Avoids subtle bugs from unexpected evaluation order

## More Examples

```java
// Without parentheses - follows default precedence
int result1 = 5 + 3 * 2;        // 5 + 6 = 11

// With parentheses - explicit control
int result2 = (5 + 3) * 2;      // 8 * 2 = 16

// Complex expression
int result3 = (10 - 2) * (3 + 4) / 2;  // 8 * 7 / 2 = 28

// Nested parentheses
int result4 = ((2 + 3) * (4 - 1)) + 5; // (5 * 3) + 5 = 20
```

## Best Practices

- Use parentheses even when not strictly necessary if it improves clarity
- Break complex calculations into multiple steps with intermediate variables
- Test your calculations with known values to verify the order of operations
- When in doubt, use parentheses to make your intention clear
