# FactoryPattern
## An exercise where the factory design pattern is used.
1. You have to verify that the provided test cases pass.
2. Implement a repo on your `GitHub` and follow up on the project locally. Practice TDD: first pass the first test case. Then complete the 
TDD cycle for the second, accompanied by the commits that come.
3. Modify the code of the test cases to guide you in the coding of the new factory classes of the different types of washing machines 
you need. If you are not able to write the code that `uses` the factories to create the washing machines, it is impossible to complete 
these classes. The implementation of the abstract class and its inheritance is a bit tricky.
4. Note the `protected` access modifiers of the instance properties and methods of the super classes and subclasses:
    - Which modifier does the method that overwrites depend on the modifier of the overwritten method?
    - What properties and methods does a class inherit from its superclass based on access modifiers?
    - Why does this code compile the code found in test cases ?:
~~~
assertTrue (washing machine. has commands);
assertTrue (washer.hasTambor);
~~~
5. To answer these questions, read chapter 16 "*Inheritance*" of the book *Beginning Java Fundamentals*, in particular the epigraphs:
    - What Is Inherited by a Subclass?
    - Method Overriding
    - Accessing Overridden Method
6. When you have finished the program, draw the class diagram of the application and add it to your repo in GitHub.
