#### Part 1. Creating the project and including the JUnit library
Copy the JUnit library before the line</project>:
```xml
<dependencies>
        <dependency>
         <groupId>junit</groupId>
          <artifactId>junit</artifactId>
   <version>4.12</version>
 <scope>test</scope>
   </dependency>
  </dependencies
<!-- Once the contents above are copied into the pom.xml file -->
<!--(before the line </project>),-->
<!--save the file.This gives the project access to the JUnit library and enables us to write unit tests.-->
```
#### Part 2. Creating the class for unit tests
#### Part 3. First unit test
- Let’s create the first test. The test uses a class called ExerciseManagement, and expects it to have a method called exerciseList that returns the list of exercises.
- The test method assertEquals receives two values as parameters -- the first is the expected value, and the second the value returned by   the program.
- Here the method is used for checking the size of a new exercise list: a new list should be empty.
```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ExerciseManagementTest {
 @Test
 public void exerciseListEmptyAtBeginning() {
 ExerciseManagement management = new ExerciseManagement();
 assertEquals(0, management.exerciseList().size());
   }
}
```
#### Part 4. Implementing the functionality that is required by the unit tests
- Let’s create the class ExerciseManagement (the class is added to the folder Source Packages). Then let’s give it a method called exerciseList that returns a list.
```java
import java.util.ArrayList;
public class ExerciseManagement {
    public ArrayList<String> exerciseList() {  
    return new ArrayList<>();
 }
}
```
#### Part 5. Second unit test and implementing the related functionality
- Next we’ll create a new test. It examines the functionality that relates to adding new exercises.
- test uses the add method of the class ExerciseManagement, using it to add a new exercise to the exercise list. If the addition was successful, the size of the exercise list should have grown by one.
- The test does function at all, since the ExerciseManagement class lacks a method called ‘add’
```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ExerciseManagementTest {
   @Test
  public void exerciseListEmptyAtBeginning() {
      ExerciseManagement management = new ExerciseManagement();
       assertEquals(0, management.exerciseList().size());    }
 @Test
public void addingExerciseGrowsListByOne() {
        ExerciseManagement management = new ExerciseManagement();
      management.add("Write a test");
      assertEquals(1, management.exerciseList().size());
 }
}
```


































