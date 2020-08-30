package co.learn.java;
//StringBuffer is mutable and Thread Safe.
public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("NewSBString");
        System.out.println("Before appending: "+sb1); //NewSBString
        sb1.append("appended");
        System.out.println("After appending: "+sb1); //NewSBStringappended
        sb1.reverse();
        System.out.println("After reversing: "+sb1); //dedneppagnirtSBSweN

        //StringBuffer to String
        String s1 = sb1.toString();
        System.out.println("converted to string: "+s1); //dedneppagnirtSBSweN
        //operation on string
        s1.concat("NewString");
        System.out.println("String after concatenation: "+s1); //dedneppagnirtSBSweN, same as previous value because String is immutable.

    }
}
