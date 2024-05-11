package borrowing;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BorrowMain {
    public static void main(String[] args) {
        Library library = new Library();
        // Data Layer (Adding Book and Users to the Online Library Management)
        // Adding books to the Online Library Management System
        library.addBook(new Book("Software Engineering Project", "9783540626251", "John Doe"));
        library.addBook(new Book("Data Analysis and Algorithms", "9782000183198", "Jane Smith"));
        library.addBook(new Book("Database Management", "9787365716180", "Robert Johnson"));

        // Adding users to the Online Library Management System
        library.addUser(new User("Malak", "1234"));
        library.addUser(new User("Samaa", "5678"));
        library.addUser(new User("Hala", "8910"));

        // Presentation Layer (Will have the user interface)
        // Login to the Online Library Management System
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Library Management System");
        System.out.println();
        System.out.print("Enter your Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();

        // Authenticating the User By its username and password
        User authenticatedUser = library.authenticateUser(username, password);
        if (authenticatedUser != null) {
            System.out.print("Enter the book title you want to borrow: ");
            String title = scanner.nextLine();

            Book borrowedBook = library.borrowBook(title, username);
            if (borrowedBook != null) {
                System.out.println("Book \"" + title + "\" borrowed successfully by " + username + ".");
                System.out.println("Borrow Receipt:");
                displayReceipt(borrowedBook);
            } else {
                System.out.println("Book \"" + title + "\" is not available for borrowing.");
            }
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
    //display receipt for the user after borrow book
    private static void displayReceipt(Book book) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Title: " + book.getTitle());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Borrow Date: " + dateFormat.format(new Date()));
    }
}
