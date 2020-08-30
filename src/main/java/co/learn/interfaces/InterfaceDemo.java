package co.learn.interfaces;
/*
- Like a class, an interface can have methods and variables, but the methods declared in an interface are by default
 abstract (only method signature, no body).
- Below inside the interface, there is method, which is abstract by default. We do not need to write it explicitly.
- It is used to achieve abstraction.
- It is used to achieve loose coupling.
- We can achieve multiple inheritance. A interface can extend multiple other interfaces at the same time.
- A class can implement more than 1 interfaces at a time.
- Interface represents IS-A relationship.
- interface can never be instantiated like a class.
- can not have a constructor.
- Members (variables and methods) of an interface are always public/default. But not private or protected.
    At run time, the default members are changed to public by Java(JVM).

 */
interface InterfaceDemo {
    public int variable=0;
    public void getName();
}

interface Interface2 extends InterfaceDemo{
    public void getName2();
}

interface Interface3 extends Interface2, InterfaceDemo{

} // Example of multi level inheritance.

interface OutOfTheLeague{
    public void newMethodForLeague();
}

class InterfaceClass implements InterfaceDemo, OutOfTheLeague{
    // Here a class implements more than one interface at the same time.
    public void getName(){

    }

    public void newMethodForLeague() {

    }
}
