public class Car{
    String make;
    String model;
    int year;
    
    // Constructor with parameters
    public Car(String make, String model, int year) {
      this.make = make;
      this.model = model;
      this.year = year;
    }
    
    // Method to get car details
    public void getCarDetails() {
      System.out.println("Make: " + this.make);
      System.out.println("Model: " + this.model);
      System.out.println("Year: " + this.year);
    }
  }

  // Main.java
class CarTest {
    public static void main(String[] args) {
      // Creating objects using constructor
      Car car1 = new Car("Toyota", "Corolla", 2021);
      Car car2 = new Car("Honda", "Civic", 2022);
      
      // Accessing object methods
      car1.getCarDetails();
      car2.getCarDetails();
    }
  }