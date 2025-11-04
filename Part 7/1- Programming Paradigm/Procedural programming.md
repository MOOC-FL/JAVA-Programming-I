#### Procedural programming
- Whereas in object-oriented programming, the structure of a program is formed by the data it processes, in procedural programming,
  the structure of the program is formed by functionality desired for the program: the program
  acts as a step-by-step guide for the functionality to be performed. The program is executed one step at a time,
   and subroutines (methods) are called whenever necessary.
- In procedural programming, the state of the program is maintained in variables and tables, and any methods handle only the values ​​provided to them as parameters. The program tells the computer what should happen. As an example, the code below demonstrates the swapping of values ​​for two variables a and b
```java
int a = 10;
int b = 15;
// let's swap the values of variables a and b
int c = b;
b =a;
a =c;
```
- The difference between object-oriented programming and procedural programming are shown concretely in the clock example presented at the beginning of Part Five. The solution below depicts a procedural style where the printing of the time is transferred to a method.
```java
int hours = 0;
int minutes = 0;
int seconds = 0;
while(true){
 //1. printing the item
 print (hours,minutes ,seconds);
System.out.println();
//2. advancing the second hand
seconds = seconds + 1 ;
//3. advancing the  other hands when necessierly
if (seconds >59){
minutes = minutes + 1 ;
seconds = 0;
 if (hours >23){
hours = 0;
}
}
```
```java
public static void print(int hours, int minutes, int seconds) {
    print(hours);
    print(minutes);
    print(seconds);
}

public static void print(int value) {
    if (value < 10) {
        System.out.print("0");

    System.out.print(value);
}
```
