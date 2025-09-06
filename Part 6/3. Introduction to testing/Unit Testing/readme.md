### Unit Testing
- The automated testing method laid out above where the input to a program is modified is quite convenient, but limited nonetheless.
-  Testing larger programs in this way is challenging. One solution to this is unit testing, where small parts of the program are tested in isolation.
-  *Unit testing* refers to the testing of individual components in the source code, such as classes and their provided methods.
- The writing of tests reveals whether each class and method observes or deviates from the guideline of each method and class having a single, clear responsibility. The more responsibility the method has, the more complex the test.
- If a large application is written in a single method, writing tests for it becomes very challenging, if not impossible. Similarly, if the application is broken into clear classes and methods, then writing tests is straightforward.


> Ready-made unit test libraries are commonly used in writing tests, which provide methods and help classes for writing tests. The most common unit testing library in Java is JUnit , which is also supported by almost all programming environments. For example, NetBeans can automatically search for JUnit tests in a project — if any are found, they will be displayed under the project in the Test Packages folder.
- Let's take a look at writing unit tests with the help of an example. Let's assume that we have the following Calculator class and want to write automated tests for it.
```java
public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value = this.value + number;
    }

    public void subtract(int number) {
        this.value = this.value + number;
    }

    public int getValue() {
        return this.value;
    }
}
```
* [ ] The calculator works by always remembering the result produced by the preceding calculation. All subsequent calculations are always added to the previous result. A minor error resulting from copying and pasting has been left in the calculator above. The method subtract should deduct from the value, but it currently adds to it.
* [ ] Unit test writing begins by creating a test class, which is created under the Test-Packages folder. When testing the Calculator class, the test class is to be called CalculatorTest. The string Test at the end of the name tells the programming environment that this is a test class. Without the string Test, the tests in the class will not be executed. (Note: Tests are created in NetBeans under the Test Packages folder.)
```java
// The test class CalculatorTest is initially empty.
public class CalculatorTest {
}
```
- Tests are methods of the test class where each test tests an individual unit. Let's begin testing the class — we start off by creating a test method that confirms that the newly created calculator's value is intially 0.
```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }
}
```
