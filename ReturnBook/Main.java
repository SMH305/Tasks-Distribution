package ReturnBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> availableBooks = new ArrayList<>();
        // Add the values of the new attributes "title" and "author"
        availableBooks.add(new Book("1234567890", "Software Engineering Project", "Ian Sommerville"));
        availableBooks.add(new Book("202105461", "Database Management", "Hector Garcia"));
        availableBooks.add(new Book("00110011", "Analysis and Design of Algorithms", "Rajesh K. Shukla"));

        List<User> users = new ArrayList<>();
        users.add(new User("samaa", "123456"));
        users.add(new User("hala", "123456"));
        users.add(new User("malak", "123456"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Library Management System");
        System.out.println();
        System.out.print("Enter your username (or 'exit' to quit): ");
        String username = scanner.nextLine();

        if (username.equalsIgnoreCase("exit")) {
            System.out.println("Goodbye!");
            scanner.close();
            return; // Exit the program
        }

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isLoggedIn = false;
        User loggedInUser = null;

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                isLoggedIn = true;
                loggedInUser = user;
                break;
            }
        }

        if (isLoggedIn) {
            System.out.println("Login successful. Welcome, " + loggedInUser.getUsername() + "!");

            System.out.print("Enter the ISBN of the book you want to return: ");
            String isbn = scanner.nextLine();

            ReturnBook returnBook = new ReturnBook(isbn);
            returnBook.returnBook(availableBooks);

            // Prompt for logout
            System.out.print("Would you like to logout? (yes/no): ");
            String logoutChoice = scanner.nextLine();

            if (logoutChoice.equalsIgnoreCase("yes")) {
                System.out.println("Logging out. Goodbye, " + loggedInUser.getUsername() + "!");
                scanner.close();
                return; // Exit the program
            }
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
