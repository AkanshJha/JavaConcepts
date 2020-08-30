package co.learn.exception;

/*
- for creating a user defined exception class, you have to extend your exception class with the Java's Exception class.
    It is recommended to extend RuntimeException class to created your own exception. Because if we extend it using
    Exception class, our customized exception will become a checked exception, which may cause the compile time error.


- We will be using the throw keyword to raise our exception.
    e.g.: throw new UserDefinedException("Description of the error");

 */
public class UserDefinedException extends Exception {

    UserDefinedException(String s){
        super(s); //This will print the description of the exception. If we do not use this line of code, our program will not
        // print the description of the exception.
    }

    UserDefinedException(Exception e){
        System.out.println("I need to what is it about.");

    }
}
