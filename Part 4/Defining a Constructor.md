#### Defining a Constructor
- We want to set an initial state for an object that's created.
  Custom objects are created the same way as objects from pre-made Java classes, such as `ArrayList`,
  using the `new` keyword. It'd be convenient to pass values ​​to the variables of that object as it's being created.
   For example, when creating a new person object, it's useful to be able to provide it with a name:
```java
public static void main(String[] args) {
    Person ada = new Person("Ada");
    // ...
}
```
- This is achieved by defining the method that creates the object, i.e., its constructor. The constructor is defined after the instance variables. In the following example, a constructor is defined for the Person class, which can be used to create a new Person object. The constructor sets the age of the object being created to 0, and the string passed to the constructor as a parameter as its name:
```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}
```
- The constructor's name is always the same as the class name. The class in the example above is named Person, so the constructor will also have to be named Person. The constructor is also provided, as a parameter, the name of the person object to be created. The parameter is enclosed in parentheses and follows the constructor's name. The parentheses that contain optional parameters are followed by curly brackets. In between these brackets is the source code that the program executes when the constructor is called (e.g., `new Person ("Ada")`).
- Objects are always created using a constructor.
- A few things to note: the constructor contains the expression `this.age = 0`. This expression sets the instance variable age of the newly created object (i.e., `"this" object's age) to 0`. The second expression `this.name = initialName` likewise assigns the string passed as a parameter to the instance variable name of the object created.
#### Default Constructor
- If the programmer does not define a constructor for a `class`, Java automatically creates a default one for it.
- A default constructor is a constructor that doesn't do anything apart from creating the object. The object's variables remain uninitialized
 (generally, the value of any object references will be `null`, meaning that they do not point to anything, and the values of primitives will be 0)
-  For example, an object can be created from the class below by making the call `new Person()`
```java
public class Person {
    private String name;
    private int age;
}
```
- If a constructor has been defined for a class, no default constructor exists. For the class below, calling `new Person` would cause an error, as Java cannot find a constructor in the class that has no parameters.
```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}
``` 








