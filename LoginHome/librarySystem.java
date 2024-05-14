/*I think you should add a signup feaure to the login main class that will allow new users to sign up.
Create a menu containing the following options for users:
signup, login, and exit.
Signed by: Malak Almari
Date: 13//5/2024
 */
package LoginHome;
import java.util.*;

public class librarySystem {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        
        // Predefined user
        User[] predefinedUsers = {
            new User("admin", "password123", "Harry Potter, Alice in Wonderland")
        };
        
        // Adding predefined users to the list
        users.addAll(Arrays.asList(predefinedUsers));
        
        Scanner scanner = new Scanner(System.in);

        //Added updated part (signup and menu of options) that were suggested by Malak.

        // Add a menu so that the user will choose to Sign Up, Login, or Exit.
        int choice;
        do {
            System.out.println("Welcome to the Online Library Management System");
            System.out.println("1) Sign Up");
            System.out.println("2) Login");
            System.out.println("3) Exit");
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
                        System.out.println("Login Successfully!");
                        displayBorrowedBooks(loggedInUser);
                    } else {
                        // Print appropriate message for failure
                        System.out.println("Login failed. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Thankyou, goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

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
}
