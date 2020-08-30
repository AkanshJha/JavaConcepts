package co.learn.java;
//String is immutable and Thread Safe because all the immutable objects are Thread Safe.
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "TestString";
        System.out.println("Before concatenating: "+s1); //TestString
        s1.concat("abc");
        System.out.println("While concatenating: "+s1.concat("abc")); //TestStringabc
        System.out.println("After concatenating: "+s1); //TestString
    }
}
