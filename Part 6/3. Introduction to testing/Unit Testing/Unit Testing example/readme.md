
![](https://github.com/mooc-fl/media/blob/main/java%20programming%201/p6-unit%20testing-1.png?raw=true)
### Creating the program in small steps
1. Create a test that tests some feature that will be added to the program.
2. Run the test.
   - It should not pass.○If the test passes, move to step 1.
3. Develop the program so that it has the functionality required to pass the test.
4. Run the tests.
   - If the tests don’t pass, move to step 3 and further develop the functionality.
5. Refactor
   -  If the program is ready, stop..
   -  Otherwise, go to step 1.
> Refactoring means cleaning the code while maintaining the functionality of the program. Cleaning includes tasks such as improving the readibility  and dividing the program into smaller methods and classes.1.Create a test that tests some feature that will be added to the program.2.Run the test. It should not pass.○If the test passes, move to step 1.3.Develop the program so that it has the functionality required to pass the test.4.Run the tests.○If the tests don’t pass, move to step 3 and further develop the functionality.5.Refactor○If the program is ready, stop..○Otherwise, go to step 1.
#### Advantages
- ●Forces the programmer to think of the functionality before writing the code
- ●Results in maintainable structure, since the program is built in small parts, refactoring steadily.
- ●The end product contains tests, which makes further development easier: when the code is changed, it’s easy to check if the existing functionality still works.
- ●Fewer bugs in production.
> More about software testing
Unit testing is only a part of software testing. On top of unit testing, a developer also performs integration tests that examine the interoperability of components, such as classes, and interface tests that test the application's interface through elements provided by the interface, such as buttons.
These testing methods are covered in more detail in the more advanced courses.
