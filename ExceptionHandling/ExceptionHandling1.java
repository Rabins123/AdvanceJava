// This is the main class
public class ExceptionHandling1{

    // This is the main method
    public static void main(String[] args) {
  
      // This is a try block that contains a statement that may throw an exception
      try {
  
        // This is a statement that may throw an ArithmeticException
        int result = 10 / 0;
  
        // This statement will not be executed if an exception occurs
        System.out.println("The result is " + result);
  
      // This is a catch block that handles the ArithmeticException
      } catch (ArithmeticException e) {
  
        // This statement prints the error message of the exception
        System.out.println("An error occurred: " + e.getMessage());
  
      // This is a finally block that executes regardless of an exception
      } finally {
  
        // This statement prints a message after the try-catch block
        System.out.println("The try-catch-finally block is finished.");
  
      }
    }
  }