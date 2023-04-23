//Ques--Custom Exception

/*
There are several ways to create a custom exception in Java, depending on your specific requirements:

1-Extending the Exception class: This is the most common way to create a custom exception in Java, as shown in the example above.

2-Extending the RuntimeException class: This approach is useful if you want to create an unchecked exception that does not need to be declared in the method signature or caught explicitly.

3-Implementing the Throwable interface: This approach allows you to define your own exception hierarchy, but it is less commonly used than the first two approaches.

4-Using an existing exception type and adding additional functionality: This approach involves creating a new class that extends an existing exception class and adds additional functionality, such as custom error messages or additional methods.
 */


// Define a custom exception class that extends the built-in Exception class
class MyCustomException extends Exception {
    // Constructor that takes a custom error message
    public MyCustomException(String errorMessage) {
        // Call the constructor of the parent class (Exception) with the error message
        super(errorMessage);
    }
}

// Main function to demonstrate the custom exception
public class CustomException1 {
    public static void main(String[] args) {
        try {
            // Throw the custom exception with a custom error message
            throw new MyCustomException("This is a custom exception");
        } catch (MyCustomException e) {
            // Catch the custom exception and print the error message
            System.out.println(e.getMessage());
        }
    }
}


