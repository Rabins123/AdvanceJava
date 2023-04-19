import java.util.*;

public class Library {
    private String book_name;
   
    private String location;
    private int numBooks;
    private int numMembers;

    // Constructor with parameters
    public Library(String book_name,  String location, int numBooks, int numMembers) {
        this.book_name = book_name;
        
        this.location = location;
        this.numBooks = numBooks;
        this.numMembers = numMembers;
    }

    // Method to display library information
    public void displayInfo() {
        System.out.println("Name: " + this.book_name);
        System.out.println("Location: " + this.location);
        System.out.println("Number of books: " + this.numBooks);
        System.out.println("Number of members: " + this.numMembers);
    }

    // Method to lend a book to a member
    public void lendBook(String bookName, String memberName) {
        if (this.numBooks > 0) {
            System.out.println("Book " + bookName + " lent to member " + memberName);
            this.numBooks--;
        } else {
            System.out.println("Sorry, no books available.");
        }
    }

    // Method to register a new member
    public void registerMember(String memberName) {
        System.out.println("Member " + memberName + " registered successfully.");
        this.numMembers++;
    }
}

// Main class

class LibraryTest {
    public static void main(String[] args) {

        // crating object of library to intialise constructor
        Scanner scanner = new Scanner(System.in);

        // Creating object using constructor
        System.out.print("Enter Book name: ");
        String book_name = scanner.nextLine();

        System.out.print("Enter member name: ");
        String member_name = scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        scanner.nextLine(); // consume newline
        System.out.print("Enter number of books: ");
        int num_books = scanner.nextInt();

        System.out.print("Enter toal number of members: ");
        int total_num_members = scanner.nextInt();
        scanner.close();

        Library library = new Library(book_name,  location, num_books, total_num_members);

        // Accessing object methods
        library.displayInfo();
        library.lendBook(book_name, member_name);
        library.registerMember(member_name);

    }
}
