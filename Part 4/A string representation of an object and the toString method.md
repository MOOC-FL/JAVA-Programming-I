#### A string representation of an object and the toString method
- We are guilty of programming in a somewhat poor style by creating a method for printing the object, ie, the `printPerson` method. A preferred way is to define a method for the object that returns a "string representation" of the object. The method returning the string representation is always `toString` in Java. Let's define this method for the person in the following example:
```java
public class Person {
    // ...

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
```
- The `toString` functions as `printPerson` does. However, it doesn't itself print anything but instead Returns a string representation, which the calling method can execute for printing as needed.
- The method is used in a somewhat surprising way:
```java
public static void main(String[] args) {
    Person pekka = new Person("Pekka");
    Person antti = new Person("Antti");

    int i = 0;
    while (i < 30) {
        pekka.growOlder();
        i = i + 1;
    }

    antti.growOlder();

    System.out.println(antti); // same as System.out.println(antti.toString());
    System.out.println(pekka); // same as System.out.println(pekka.toString());
}
```
- In principle, the `System.out.println` method requests the object's string representation and prints it. The call to the `toString` method returning the string representation does not have to be written explicitly, as Java adds it automatically. When a programmer writes:
```java
System.out.println(antti);
```
> Java extends the call at run time to the following form:
```java
System.out.println(antti.toString());
```
- As such, the call `System.out.println(antti` )calls the `toString` method of the `antti` object and prints the string returned by it.
- We can remove the now obsolete `printPerson` method from the Person class.















