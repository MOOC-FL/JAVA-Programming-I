### Test-Driven Development
> Test-driven development is a software development process that's based on constructing a piece of software in small iterations. In test-driven software development, the first thing a programmer always does is write an automatically-executable test, which tests a single piece of the computer program.

* [ ] The test will not pass because the functionality that satisfies the test,
* [ ]  i.e., the part of the computer program to be examined, is missing.
* [ ]   Once the test has been written, functionality that meets the test requirements is added to the program.
* [ ]    The tests are then run again.
* [ ]    If all tests pass, a new test is added, or alternatively,
* [ ]    if the tests fail, the already-written program is corrected.
* [ ]    If necessary, the internal structure of the program will be corrected or refactored,
* [ ]     so that the functionality of the program remains the same, but the structure becomes clearer.
> Test-driven software development consists of five steps that are repeated until the functionality of the program is complete.
1. *Write a test.*
   - The programmer decides which program functionality to test and writes a test for it.
2. *Run the tests and check if the tests pass.*
   - When a new test is written, the tests are run.
   - If the test passes, the test is most likely erroneous and should be corrected -
   - the test should only test functionality that hasn't yet been implemented.
3. *Write the functionality that meets the test's requirements.*
   - The programmer implements functionality that only meets the test requirements.
     > Note: this doesn't do things that the test does not require - functionality is only added in small increments.
4. *Perform the tests.*
   - If the tests fail, there is likely to be an error in the functionality written.
   -  Correct the functionality - or, if there is no error in the functionality, fix the latest test that was performed.
5. *Repair the internal structure of the program.*
   - As the size of the program increases, its internal structure is adjusted as needed.
   - Methods that are too long are broken down into multiple parts and classes representing concepts are isolated.
   - The tests are not modified, but are instead used to verify the correctness of the changes made to the program's internal structure -
   - if a change in the program structure changes the functionality of the program, the tests will produce a warning and the programmer can remedy the situation.


