// Declare an abstract class named Shape
abstract class Shape {
    // Declare an abstract method named draw
    abstract void draw();
  }
  
  // Define a subclass named Rectangle that extends Shape
  class Rectangle extends Shape {
    // Implement the draw method for Rectangle
    void draw() {
      System.out.println("Drawing a rectangle");
    }
  }
  
  // Define a subclass named Circle that extends Shape
  class Circle extends Shape {
    // Implement the draw method for Circle
    void draw() {
      System.out.println("Drawing a circle");
    }
  }
  
  // Define a main class named TestAbstraction
  public class AbstractClass2 {
    // Define the main method
    public static void main(String[] args) {
      // Create an object of Rectangle class
      Rectangle r = new Rectangle();
      // Call the draw method of Rectangle
      r.draw();
      // Create an object of Circle class
      Circle c = new Circle();
      // Call the draw method of Circle
      c.draw();
    }
  }
