#### Defining Methods For an Object
- We know how to create an object and initialize its `variables`. However, an object also needs methods to be able to do anything.
  As we've learned, a **method** is a named section of source code inside a class which can be invoked.
```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
```
- A `method` is written inside of the class beneath the constructor. The method name is preceded by `public void`, since the method is intended to be visible to the outside world `(public)`, and it does not return a value `(void)`.
> **Objects and the Static Modifier**
> We've used the modifier `static` in some of the methods that we've written.
> The `static` modifier indicates that the method in question does not belong to an object and thus cannot be used to access any variables that belong to objects.




