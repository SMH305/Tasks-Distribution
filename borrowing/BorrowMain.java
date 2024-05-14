
  /*You can add borrow receipt to give the user more information about the book that he had borrow 
 * signed by : Samaa Atta 
 * Date: 13/05/2024
  */

package borrowing;

import java.util.Scanner;

public class BorrowMain {
    public static void main(String[] args) {
        Library library = new Library();
        // Data Layer (Adding Book and Users to the Online Library Management)
        // Adding books to the Online Library Management System
        library.addBook(new Book("Software Engineering Project", "9783540626251"));
        library.addBook(new Book("Data Analysis and Algorithms", "9782000183198"));
        library.addBook(new Book("Database Management", "9787365716180"));

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

            if (library.borrowBook(title, username)) {
                System.out.println("Book \"" + title + "\" borrowed successfully by " + username + ".");
            } else {
                System.out.println("Book \"" + title + "\" is not available for borrowing.");
            }
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}