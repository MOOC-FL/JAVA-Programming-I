#### Introduction to object-oriented programming
- Learning Objectives
> You're familiar with the concepts of class, object, constructor, object methods, and object variables.

> You understand that a class defines an object's methods and that the values of instance (object) variables are object-specific.

> You know how to create classes and objects, and know how to use objects in your programs.
- We'll now begin our journey into the world of object-oriented programming. We'll start with focusing on describing concepts and data using objects. From there on, we'll learn how to add functionality, i.e., methods to our program.
- Object-oriented programming is concerned with isolating concepts of a problem domain into separate entities and then using those entities to solve problems. Concepts related to a problem can only be considered once they've been identified. In other words, we can form abstractions from problems that make those problems easier to approach.
- Once concepts related to a given problem have been identified, we can also begin to build constructs that represent them into programs. These constructs, and the individual instances that are formed from them, i.e., objects, are used in solving the problem. The statement "programs are built from small, clear, and cooperative objects" may not make much sense yet. However, it will appear more sensible as we progress through the course, perhaps even self-evident.

| **Aspect**               | **Class**                                                                 | **Object**                                                                 |
|--------------------------|--------------------------------------------------------------------------|----------------------------------------------------------------------------|
| **Definition**           | A blueprint or template for creating objects.                            | An instance of a class.                                                    |
| **Nature**               | Logical (conceptual) entity.                                             | Physical (real-world) entity.                                              |
| **Memory Allocation**    | No memory is allocated when a class is defined.                          | Memory is allocated when an object is created (using `new`).               |
| **Declaration**          | Declared once using the `class` keyword.                                 | Created multiple times from a class.                                       |
| **Example**              | `class Car { ... }`                                                      | `Car myCar = new Car();`                                                   |
| **Relationship**         | A class is a template for objects.                                       | An object is a specific realization of a class.                            |
| **Composition**          | Contains fields (data) and methods (behavior).                           | Contains actual values for fields and can invoke methods.                  |
| **Lifetime**             | Loaded into memory when the program starts (or when referenced).         | Created at runtime and destroyed by garbage collection when no longer used.|
| **Keyword for Creation** | `class`                                                                  | `new`                                                                      |
| **Usage**                | Defines structure, behavior, and type.                                   | Represents actual data and performs operations.                            |

**Key Analogy**:  
- **Class** = Architectural blueprint of a house.  
- **Object** = Actual house built using that blueprint.

