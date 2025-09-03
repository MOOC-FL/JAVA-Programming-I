Object subclass: #Dog
    instanceVariableNames: 'name breed age'
    classVariableNames: ''
    package: 'MyAnimals'
    
//Object subclass: #Dog: The class Dog is created as a subclass of Object (the root of most class hierarchies).
//instanceVariableNames: 'name breed age': This defines the object's attributes (name, breed, age).
//classVariableNames: '': This is for variables shared by all instances of the class (none here).
//package: 'MyAnimals': The name of the package or category this class belongs to.

Methods define the behavior of objects. We define methods for the instance of Dog (e.g., for a specific dog named "Fido").

a. Setter (Mutator) Methods:
These methods set the values of the instance variables.

smalltalk
!Dog methods!
name: aString
    name := aString
smalltalk
!Dog methods!
breed: aString
    breed := aString
smalltalk
!Dog methods!
age: anInteger
    age := anInteger
b. Getter (Accessor) Methods:
These methods return the values of the instance variables.

smalltalk
!Dog methods!
name
    ^ name
smalltalk
!Dog methods!
breed
    ^ breed
smalltalk
!Dog methods!
age
    ^ age
c. A Custom Behavior Method:
This is where the power of objects comes in. We define an action the dog can perform.

smalltalk
!Dog methods!
bark
    "Causes the dog to bark a message to the user"

    | message |
    message := 'Woof! Woof! My name is ', name, '.'.
    ^ message
The ^ symbol means "return".

The | message | syntax declares a local temporary variable named message.

3. Defining a Class Method (Constructor)
A class method is used to create new instances of Dog. It's a message you send to the class Dog itself, not to an instance.

smalltalk
!Dog class methods!
newWithName: aName breed: aBreed age: anAge
    "Create and initialize a new Dog instance"

    | newDog |
    newDog := self new. "Send 'new' to the class itself to create a new instance"
    newDog name: aName.
    newDog breed: aBreed.
    newDog age: anAge.
    ^ newDog
4. Using the Dog Class: A Sample "Workspace" Session
Now, let's see how we would use this class in a live environment. You would type this code into a "Workspace" or "Playground" and execute it line by line.

smalltalk
"Create a new Dog instance by sending a message to the Dog CLASS"
myDog := Dog newWithName: 'Rex' breed: 'Doberman' age: 5.

"Send messages to the INSTANCE myDog"
name := myDog name. "message: 'name' | returns 'Rex'"
barkMessage := myDog bark. "message: 'bark'"

"Print the results to the screen (transcript)"
Transcript show: 'Dog''s name: ', name; cr.
Transcript show: barkMessage; cr.

"Change the state of the object by sending it a message"
myDog age: 6.
Transcript show: 'New age: ', (myDog age) asString; cr.
