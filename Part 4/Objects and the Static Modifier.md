#### Objects and the `static` Modifier in Java
> We've used the modifier `static` in some of the methods that we've written. The `static` modifier indicates that the method in question does not belong to an object and thus cannot be used to access any variables that belong to objects.

> Going forward, our methods will not include the `static` keyword if they're used to process information about objects created from a given class. If a method receives as parameters all the variables whose values ​​it uses, it can have a `static` modifier.


#### Key Differences at a Glance

| **Aspect** | **Instance (Non-Static) Members** | **Static Members** |
|------------|-----------------------------------|-------------------|
| **Belongs to** | Individual objects (instances) | Class itself |
| **Memory Allocation** | Separate copy for each object | Single shared copy for all objects |
| **Access Method** | Through object reference: `obj.member` | Through class name: `ClassName.member` |
| **Lifecycle** | Created with object, destroyed with object | Created when class loads, exists until program ends |
| **Can Access Instance Members?** | Yes (directly) | No (requires object reference) |
| **Can Access Static Members?** | Yes | Yes (directly) |
| **Common Use Cases** | Object-specific state/behavior | Utility methods, constants, shared counters |

#### Detailed Examples

#### 1. **Class with Both Static and Instance Members**

```java
public class Employee {
    // Static variable - shared by all instances
    private static int employeeCount = 0;
    public static final String COMPANY = "TechCorp"; // Static constant
    
    // Instance variables - unique to each object
    private String name;
    private int id;
    
    // Constructor
    public Employee(String name) {
        this.name = name;
        this.id = ++employeeCount; // Using static variable
    }
    
    // Instance method
    public void displayInfo() {
        // Can access both instance and static members
        System.out.println("ID: " + id + ", Name: " + name + 
                         ", Company: " + COMPANY);
    }
    
    // Static method
    public static int getEmployeeCount() {
        // Can only access static members directly
        return employeeCount;
        // System.out.println(name); // ERROR: Cannot access instance member
    }
}
```

#### 2. **Usage in Main Method**

```java
public class Main {
    public static void main(String[] args) {
        // Accessing static members (no object needed)
        System.out.println("Company: " + Employee.COMPANY);
        System.out.println("Initial count: " + Employee.getEmployeeCount());
        
        // Creating objects
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        
        // Accessing instance members
        emp1.displayInfo();
        emp2.displayInfo();
        
        // Accessing static method
        System.out.println("Total employees: " + Employee.getEmployeeCount());
        
        // Static method can also be called on objects (but not recommended)
        System.out.println(emp1.getEmployeeCount()); // Works but misleading
    }
}
```

#### 3. **Static Block for Initialization**

```java
public class Database {
    // Static variable
    private static String connection;
    
    // Static initialization block - runs once when class loads
    static {
        System.out.println("Loading database driver...");
        connection = establishConnection();
    }
    
    private static String establishConnection() {
        return "Connected to database";
    }
    
    public static String getConnection() {
        return connection;
    }
}
```

#### 4. **Important Restrictions**

```java
public class Example {
    private int instanceVar = 10;
    private static int staticVar = 20;
    
    // Instance method - can access both
    public void instanceMethod() {
        System.out.println(instanceVar); // OK
        System.out.println(staticVar);   // OK
    }
    
    // Static method - restricted access
    public static void staticMethod() {
        // System.out.println(instanceVar); // ERROR: Cannot access instance
        System.out.println(staticVar);      // OK
        
        // To access instance variable, need an object
        Example obj = new Example();
        System.out.println(obj.instanceVar); // OK through object reference
    }
}
```

#### Common Use Cases for `static`

#### **1. Utility/Helper Classes**
```java
public class MathUtils {
    // Prevent instantiation
    private MathUtils() {}
    
    public static final double PI = 3.14159;
    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
}
// Usage: MathUtils.circleArea(5.0)
```

#### **2. Constants**
```java
public class Constants {
    public static final int MAX_USERS = 1000;
    public static final String APP_NAME = "MyApp";
    public static final double TAX_RATE = 0.08;
}
```

#### **3. Factory Methods**
```java
public class Logger {
    private static Logger instance;
    
    private Logger() {} // Private constructor
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
```

#### **4. Main Method**
```java
public class Application {
    // Must be static - called without creating Application object
    public static void main(String[] args) {
        // Application logic here
    }
}
```

#### Memory Diagram

```
[Class Area/Method Area]
├── Employee.class
├── static employeeCount = 2
└── static COMPANY = "TechCorp"

[Heap Memory]
├── Employee Object #1
│   ├── name = "Alice"
│   └── id = 1
│
└── Employee Object #2
    ├── name = "Bob"
    └── id = 2
```

#### Best Practices

1. **Use `static` for:**
   - Constants (`static final`)
   - Utility methods that don't need object state
   - Factory methods
   - Singleton instances
   - Shared counters/caches

2. **Avoid `static` for:**
   - State that should be unique per object
   - Methods that need polymorphism/overriding
   - Most variables (unless truly shared)

3. **Remember:**
   - Static methods cannot be overridden (only hidden)
   - Static context (methods/blocks) cannot use `this` or `super`
   - Static variables are initialized before any object creation

#### Quick Reference Table

| **Scenario** | **Should it be static?** | **Why?** |
|--------------|-------------------------|----------|
| Company name for all employees | Yes | Shared by all instances |
| Employee salary | No | Unique to each employee |
| Math utility functions | Yes | No object state needed |
| Bank account balance | No | Unique to each account |
| Application configuration | Yes | Shared across application |
| Car color | No | Specific to each car |
| Counter of created objects | Yes | Shared tracking |
| Database connection pool | Yes | Shared resource |
