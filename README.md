*Made for Elijah Nicpon's CS 1331 Exam 2 Double PLUS (Peer Led Undergraduate Study) Session*

# Welcome!
I'm gonna go ahead and say you'll get the most from this in an IDE. IntelliJ will probably be the easiest to set up out-of-the-box.
Anyways... onto the lab. Here's a diagram.



##Abstraction and Abstract Classes
*The creation of well-defined classes and interfaces to hide well the complex inner workings from its users.*

###Abstract Classes
- `TODO: 1.1` In Main.java, try to declare a Bird, an Animal, and a Hummingbird.
- `TODO: 1.2` Try to instantiate the values created in the previous step. What happens?

###Abstract Methods
- `TODO: 2.1` Make the Animal.java class's an `makeNoise()` method abstract.
  - Ah! Some red squigglies have appeared! We must fix them!
  - `TODO: 2.2` Solution 1: Implement `makeNoise()` in the Bird class
    - Use this if you forgot what birds sound like `System.out.println("tweet tweet");`
    - Write some code to test what happens when we call makeNoise on both a Hummingbird and a Hawk.
    - Lastly, comment out your implementation to prepare for solution 2...
  - `TODO: 2.3` Solution 2: Implement `makeNoise()` in both the HummingBird and Hawk classes.
    - Make something up if you don't know what those sound like
    - Write some code to test what happens when we call makeNoise on both a Hummingbird and a Hawk.

##Polymorphism
*The ability of an object to take on many forms*

##Casting
*The utilization of polymorphism in code*

###Upcasting
*Always compiles, always runs*

`Person p1 = new Student()`

###Sidecasting
*Never compiles, thus never runs*

`Professor p1 = new Student()`


###DownCasting
*Always compiles, sometimes runs*

`Student p1 = new Person()`