#### Calculating a Sum from Objects on a List
- Let's now create a method for the amusement park ride that calculates the average height of the people currently on it.
- Average height can obtained by calculating the average from the persons on the ride
- the average is calculated by adding up the individual values and dividing that sum by the number of values.
> The implementation underneath returns -1 if not a single person is on the ride. The result of -1 is impossible in a program that calculates averages. Based on that, we can determine that the average could not have been calculated.
```java
public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    // ..

    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (Person per: riding) {
            sumOfHeights += per.getHeight();
        }

        return 1.0 * sumOfHeights / riding.size();
    }

    // ..
}
```
```java
Person matti = new Person("Matti");
matti.setHeight(180);

Person juhana = new Person("Juhana");
juhana.setHeight(132);

Person awak = new Henkilo("Awak");
awak.setHeight(194);

AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru", 140);

hurjakuru.isAllowedOn(matti);
hurjakuru.isAllowedOn(juhana);
hurjakuru.isAllowedOn(awak);

System.out.println(hurjakuru);
System.out.println(hurjakuru.averageHeightOfPeopleOnRide());

```
> The program's output is:

> Sample output
Hurjakuru, minimum height requirement: 140, visitors: 2
on the ride:
Matti
Awak
187.0
