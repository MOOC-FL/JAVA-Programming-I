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
* [ ] In the calculatorInitialValueZero method a calculator object is first created. The assertEquals method provided by the JUnit test framework is then used to check the value.
* [ ] The method is imported from the Assert class with the import Static command, and it's given the expected value as a parameter - 0 in this instance - and the value returned by the calculator.
* [ ]  If the values of the assertEquals method values ​​differ, the test will not pass. Each test method should have an "annotation" @ Test.
* [ ]  This tells the JUnit test framework that this is an executable test method.
- Running the tests prints to the output tab (typically at the bottom of NetBeans) that contains some information specific to each test class. In the example below, tests of the CalculatorTest class from the package are executed. The number of tests executed were 1, none of which failed — failure in this context means that the functionality tested by the test did not work as expected. ->
```JUnit
Testsuite: CalculatorTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.054 sec

test-report:
test:
BUILD SUCCESSFUL (total time: 0 seconds)
```
```java
// Let's add functionality for adding and subtracting to the test class.
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        Calculator calculator = new Calculator();
        calculator.subtract(2);
        assertEquals(-2, calculator.getValue());
    }
}
//Executing the tests produces the following output.
```
```JUnit
Testsuite: CalculatorTest
Tests run: 3, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.059 sec

Testcase: valueMinusTwoWhenTwoSubstracted(CalculatorTest): FAILED
expected:<-2> but was:<2>
junit.framework.AssertionFailedError: expected:<-2> but was:<2>
at CalculatorTest.valueMinusTwoWhenTwoSubstracted(CalculatorTest.java:25)

Test CalculatorTest FAILED
test-report:
test:
BUILD SUCCESSFUL (total time: 0 seconds)
```























