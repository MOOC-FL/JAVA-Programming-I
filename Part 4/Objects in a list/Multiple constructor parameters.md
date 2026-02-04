#### Multiple constructor parameters
- If the constructor demands more than one parameter, you can query the user for more information. Let's assume we have the following constructor for the class `Person`.
```java
public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    // methods
}
```
> In this case, an object is created by calling the two-parameter constructor.

- If we want to query the user for this kind of object, they must be asked for each parameter separately. In the example below, name and age parameters are asked separately from the user. Entering an empty name will end the reading part.
- The persons are printed after they have been read.
```java
Scanner scanner = new Scanner(System.in);
ArrayList<Person> persons = new ArrayList<>();

// Read person information from the user
while (true) {
    System.out.print("Enter name, empty will end: ");
    String name = scanner.nextLine();
    if (name.isEmpty()) {
        break;
    }

    System.out.print("Enter the age of the person " + name + ": ");

    int age = Integer.valueOf(scanner.nextLine());

    // We add a new person to the list.
    // The person's name and age were decided by the user
    persons.add(new Person(name, age));
}

// We'll print the number of the inputted persons, and the persons themselves
System.out.println();
System.out.println("Total number of persons: " + persons.size());
System.out.println("Persons: ");

for (Person person: persons) {
    System.out.println(person);
}
```
```text
Sample output
Enter name, empty will end: Grace Hopper 
Enter the age of the person Grace Hopper: 85 
Enter name, empty will end:

Total number of persons: 1 Persons: Grace Hopper, age 85 years
```
#### Reading input in a specific format
- In the example and exercise below, the required information was entered line by line. By no means is it impossible to ask for input in a specific format, eg separated by a comma.
- If the name and age were separated by a comma, the program could work in the following manner.
```java
Scanner scanner = new Scanner(System.in);
ArrayList<Person> persons = new ArrayList<>();

// Read person information from the user
System.out.println("Enter the person details separated by a comma, e.g.: Randall,2");
while (true) {
    System.out.print("Enter the details, empty will stop: ");
    String details = scanner.nextLine();
    if (details.isEmpty()) {
        break;
    }

    String[] parts = details.split(",");
    String name = parts[0];
    int age = Integer.valueOf(parts[1]);
    persons.add(new Person(name, age));
}

// Print the number of the entered persons, and the persons themselves
System.out.println();
System.out.println("Total number of persons: " + persons.size());
System.out.println("Persons: ");

for (Person person: persons) {
    System.out.println(person);
}
```
```text
Sample output
Enter the person details separated by a comma, eg: Randall,2 Enter the details, empty will stop: Leevi,2 
Enter the details, empty will stop: Anton,2 
Enter the details, empty will stop: Sylvi,0 
Enter the details, empty will stop:

Total number of persons: 3 Persons: Leevi, age 2 years Anton, age 2 years Sylvi, age 0 years
```
#### Filtered printing from the list
- You can also examine the objects on the list as you go through it. In the example below, we first ask the user for an age restriction, after which we print all the objects whose age is at least the number given by the user.
```java
// Assume we have a 'persons' list
// that consists of person objects

System.out.print("What is the age limit? ");
int ageLimit = Integer.valueOf(scanner.nextLine());

for (Person person: persons) {
    if (person.getAge() >= ageLimit) {
        System.out.println(person);
    }
}
```












