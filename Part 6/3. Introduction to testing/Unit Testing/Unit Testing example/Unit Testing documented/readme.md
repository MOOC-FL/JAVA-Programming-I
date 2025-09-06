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
