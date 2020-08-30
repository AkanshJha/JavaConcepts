package co.learn.oop.inheritence;
// Java supports Single, Hierarchical and  Multilevel inheritance.
// It is an IS-A relationship.
public class ParentClass {
    int var1 = 14;
    String strVar = "NewString";
}

class ChildClass extends ParentClass{
    int var2 = 13;
    String childStr = "child String";
}

class MainClass{
    public static void main(String[] args) {
        ChildClass ch = new ChildClass();
        ParentClass ch1 = new ChildClass();

        System.out.println("Var from Parent: "+ch.var1); //14
        System.out.println("Var of its own: "+ch.var2); //13
        System.out.println("String from Parent: "+ch.strVar); //NewString
        System.out.println("String of its own: "+ch.childStr); //child String
        System.out.println("        Parent to Child object         ");
        System.out.println("P2C Var from Parent: "+ch1.var1); //14
        // System.out.println("P2C Var of its own: "+ch1.var2); It won't be able to access the child object because Object is type of Parent.
        System.out.println("P2C String from Parent: "+ch1.strVar); // NewString
        // System.out.println("P2C String of its own: "+ch1.childStr);

        //System.out.println(ch1.);

    }
}

//HAS-A relationship is losly coupled/Assosiated.
// It can be used If we use a class type in other class as a class variable or instance variable.
