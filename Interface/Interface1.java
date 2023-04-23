// Declare an interface using the interface keyword
interface Vehicle {
  // Declare two abstract methods (public and abstract by default)
  void start();
  void stop();
}

// Declare a class that implements the interface using the implements keyword
class Bike implements Vehicle {
  // Override the start method and provide the implementation
  @Override
  public void start() {
    // Print a message when the bike starts
    System.out.println("The bike has started.");
  }
  // Override the stop method and provide the implementation
  @Override
  public void stop() {
    // Print a message when the bike stops
    System.out.println("The bike has stopped.");
  }
}

// Declare another class that implements the interface using the implements keyword
class Car implements Vehicle {
  // Override the start method and provide the implementation
  @Override
  public void start() {
    // Print a message when the car starts
    System.out.println("The car has started.");
  }
  // Override the stop method and provide the implementation
  @Override
  public void stop() {
    // Print a message when the car stops
    System.out.println("The car has stopped.");
  }
}

// Declare a class that contains the main method
public class Interface1 {
  // Define the main method
  public static void main(String[] args) {
    // Create an object of Bike class
    Bike b = new Bike();
    // Call the start and stop methods from the Vehicle interface on the bike object
    b.start();
    b.stop();
    
    // Create an object of Car class
    Car c = new Car();
    // Call the start and stop methods from the Vehicle interface on the car object
    c.start();
    c.stop();
  }
}