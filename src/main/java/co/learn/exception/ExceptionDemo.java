package co.learn.exception;
/*
- An exception is an event, which occurs during the execution of the program. It stops the execution abruptly.
- When an exception occurs, JVM creates a exception object to identify the type of exception that has occurred.
- Exception is referred as RunTime Error.
- If we want to run the program, even after the exception is occurred, we have to handle that exception.
- We can handle the exception using the try-catch block.
- There are3 types of exception-
    Checked Exceptions - Compile Time Exception: Can be handled by try-catch or throws keyword.
    Unchecked Exceptions - RunTime Exception
    Errors: These are exceptional conditions that are external to the condition. Eg: StackOverflow OutOfMemoryError
- e.getMessage(), prints the error.
- printStackTrace(e), prints the whole error.
- finally is executed whether there is an error or not.
- We can write multiple catch blocks for a single try try block. Only the order/hierarchy of the catched exception should
  be in ascending order.
  try{
  }
  catch(ArithmeticException e){
  }
  catch(Exception e){
  }
  The above exceptions are handled in ascending order. If we write he catch block with super class Exception as the first
  catch block, it would give the compile time error.

 */
public class ExceptionDemo {
}
