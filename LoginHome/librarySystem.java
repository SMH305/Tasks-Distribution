package LoginHome;
import java.util.*;
public class librarySystem {

            public static void main(String[] args) {
                User[] users = {
                        new User("admin", "password123", "Harry Potter, Alice in Wonderland"),
                };

                Scanner scanner = new Scanner(System.in);

                // Perform login
                User loggedInUser = login(users, scanner);
                if (loggedInUser != null) {
                    // User logged in successfully, display borrowed books
                    System.out.println("Login successfully!");
                    displayBorrowedBooks(loggedInUser);
                } else {
                    // Print appropriate message for failure
                    System.out.println("Login failed. try again");
                }

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
        }