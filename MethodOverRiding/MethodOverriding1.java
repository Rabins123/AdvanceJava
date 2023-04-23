//Creating a parent class
class Vehicle {
  //defining a method
  void run() {
    System.out.println("Vehicle is running");
  }
}

//Creating a child class
class Bike extends Vehicle {
  //defining the same method as in the parent class
  @Override
  void run() {
    System.out.println("Bike is running safely");
  }

}

public class MethodOverriding1{
  //defining the main function
  public static void main(String[] args) {
    //creating an object of the child class
    Bike b = new Bike();
    //calling the method with the child class object
    b.run();

    Vehicle  v = new Vehicle();
    v.run();
  }
}