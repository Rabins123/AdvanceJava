//Laerning abstract class

// an abstract class
abstract class Animal {
  // an abstract method
  abstract void makeSound();
  // a non-abstract method
  void eat() {
    System.out.println("I can eat.");
  }
}

// a subclass of Animal
class Dog extends Animal {
  // implementing the abstract method
  void makeSound() {
    System.out.println("Bark bark");
  }
}

// a class with main method
public class AbstractClass1 {
  public static void main(String[] args) {
    // creating an object of Dog class
    Dog d1 = new Dog();
    // calling the abstract method
    d1.makeSound();
    // calling the non-abstract method
    d1.eat();
  }
}





//Note
/*
 In this code, we have an abstract class Animal that has an abstract method makeSound() and a non-abstract method eat(). We also have a subclass Dog that extends the abstract class and provides the implementation of the abstract method. We cannot create an object of the abstract class, but we can create an object of the subclass and use it to access the methods of the abstract class.
 */