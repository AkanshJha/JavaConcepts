package co.learn.oop.polymorphism;
/* Run-Time Polymorphism  === Dynamic Overriding
 In a extended class, if a child class is having method with same signatures, then it is called the Method overriding.
 It should be used in Inheritance or in IS-A relationship.

 */

public class MethodOverRiding {
    public void methodToBeOverridden(int numb){

    }
}

class OverridingClass extends MethodOverRiding{
    @Override
    public void methodToBeOverridden(int numb) {
        //super.methodToBeOverridden(numb);
        // Here we can write the piece of code.
    }
}
