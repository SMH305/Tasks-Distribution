package LoginHome;
import java.util.*;

public class librarySystem {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        // Add a menu so that the user will choose to Sign Up, Login, Change Password, or Exit
        int choice;
        do {
            System.out.println("Welcome to the Online Library Management System");
            System.out.println("1) Sign Up");
            System.out.println("2) Login");
            System.out.println("3) Change Password");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // Perform sign up
                    signUp(users, scanner);
                    break;
                case 2:
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
                case 3:
                    // Change password
                    changePassword(users, scanner);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }



  

    static void displayBorrowedBooks(User user) {
        if (user.getBorrowedBooks() != null && !user.getBorrowedBooks().isEmpty()) {
            System.out.println("Borrowed books for " + user.getUsername() + ": " + user.getBorrowedBooks());
        } else {
            System.out.println("No borrowed books for " + user.getUsername());
        }
    }
    static void signUp(List<User> users, Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
    
        User newUser = new User(username, password, null);
        users.add(newUser);
        System.out.println("Sign up successful!");
    }
    
    static User login(List<User> users, Scanner scanner) {
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

    static void changePassword(List<User> users, Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter current password: ");
        String currentPassword = scanner.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

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