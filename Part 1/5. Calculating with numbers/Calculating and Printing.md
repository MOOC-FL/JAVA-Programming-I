#### Calculating and Printing
- The command System.out.printlnprints the value of a variable. The string literal to be printed, which is marked by quotation marks, can be appended with other content by using the operation +.
```java
int length = 42;
System.out.println("Length " + length);
Sample output
Length 42
```
```java
System.out.println("here is an integer --> " + 2);
System.out.println(2 + " <-- here is an integer");
Sample output
here is an integer —> 2 2 <— here is an integer
```
- If one of the operands of the operation +is a string, the other operand will be changed into a string too during program execution. In the example below, the integer 2is turned into the string "2", and a string has been appended to it.

  > The precedence introduced earlier also applies here:

System.out.println("Four: " + (2 + 2));
System.out.println("But! Twenty-two: " + 2 + 2);
