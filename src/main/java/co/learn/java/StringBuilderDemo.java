package co.learn.java;
// StringBuilder is Mutable but not Thread Safe.
public class StringBuilderDemo {
    public static void main(String[] args) {
        //StringBuilder is faster than StringBuffer as it is not thread safe. i.e. multiple thread can access the same simultaneously.
        StringBuilder sbu1 = new StringBuilder("NewSBU1");
        System.out.println(sbu1.capacity()); //23, i.e., length of string +16.
        sbu1.append("2312.113");
        System.out.println("After appending float value: "+sbu1); //NewSBU12312.113

    }
}
