import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String major;
    private double gpa;

    // constructor with parameter
    public Student(String name, int age, String major, double gpa) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Major: " + this.major);
        System.out.println("GPA: " + this.gpa);
    }

    // method to calculate grade based on gpa
    public String calculateGrade() {
        if (this.gpa >= 3.5) {
            return "A";
        } else if (this.gpa >= 3.0) {
            return "B";
        } else if (this.gpa >= 2.0) {
            return "C";
        } else {
            return "F";
        }
    }
}

// Main.java

class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating object using constructor
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter student major: ");
        String major = scanner.nextLine();
        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        scanner.close();

        Student student = new Student(name, age, major, gpa);

        // Accessing object methods
        student.displayInfo();
        System.out.println("Grade: " + student.calculateGrade());
    }
}
