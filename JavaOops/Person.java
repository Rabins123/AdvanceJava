// Person.java - the superclass
public class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
    
    public void greet() {
        System.out.println("Hi, nice to meet you!");
    }
}

// Employee.java - subclass of Person
class Employee extends Person {
    private double salary;
    
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    
    // Method overriding
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old. I work as an employee and earn " + salary + " dollars per year.");
    }
    
    // Method overloading
    public void greet(String otherPersonName) {
        System.out.println("Hi, " + otherPersonName + ", nice to meet you!");
    }
    
    // Other concepts of Java OOPs: encapsulation and access modifiers
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Main.java - the main function in a separate class
class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        Employee employee = new Employee("Bob", 30, 50000);
        
        person.introduce(); // Output: Hello, my name is Alice and I'm 25 years old.
        employee.introduce(); // Output: Hello, my name is Bob and I'm 30 years old. I work as an employee and earn 50000 dollars per year.
        
        employee.greet(); // Output: Hi, nice to meet you!
        employee.greet("Charlie"); // Output: Hi, Charlie, nice to meet you!
        
        employee.setSalary(60000);
        System.out.println("Bob's salary is now " + employee.getSalary() + " dollars per year."); // Output: Bob's salary is now 60000 dollars per year.
    }
}

