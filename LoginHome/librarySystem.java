package LoginHome;
import java.util.*;

public class librarySystem {

    public static void main(String[] args) {
        User[] users = {
            new User("admin", "password123", "Harry Potter, Alice in Wonderland")
        };

        Scanner scanner = new Scanner(System.in);
        // Add a menu so that the user will choose to Login, Change Password, or Exit
        int choice;
        do {
            System.out.println("Welcome to the Online Library Management System");
            System.out.println("1) Login");
            System.out.println("2) Change Password");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // Perform login
                    User loggedInUser = login(users, scanner);
                    // User logged in successfully, display borrowed books
                    if (loggedInUser != null) {
                        System.out.println("Login successfully!");
                        displayBorrowedBooks(loggedInUser);
                    } else {
                        // Print appropriate message for failure
                        System.out.println("Login failed. Please try again.");
                    }
                    break;
                case 2:
                    changePassword(users, scanner);
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }

    static User login(User[] users, Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    static void displayBorrowedBooks(User user) {
        if (user.getBorrowedBooks() != null && !user.getBorrowedBooks().isEmpty()) {
            System.out.println("Borrowed books for " + user.getUsername() + ": " + user.getBorrowedBooks());
        } else {
            System.out.println("No borrowed books for " + user.getUsername());
        }
    }
    
    // Change password method so that the system will enable the user to 
    //enter the username, current password, new password
    static void changePassword(User[] users, Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter current password: ");
        String currentPassword = scanner.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

        // When the user wants to change password it will check if the entered
        // username and current password are correct
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(currentPassword)) {
                user.setPassword(newPassword);
                System.out.println("Password changed successfully!");
                return;
            }
        }
        System.out.println("Change password failed. Invalid username or current password.");
    }
}