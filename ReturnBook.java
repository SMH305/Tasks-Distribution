import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturnBook {
    private String isbn;
    private static List<String> availableIsbns = new ArrayList<>();
    private static List<User> users = new ArrayList<>();

    public ReturnBook(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void returnBook() {
        if (availableIsbns.contains(isbn)) {
            System.out.println("Book with ISBN " + isbn + " has been returned.");
           
        } else {
            System.out.println("Book with ISBN " + isbn + " is not available.");
        }
    }

    public static void main(String[] args) {
        // Add some example ISBNs to the availableIsbns list
        availableIsbns.add("1234567890");
        availableIsbns.add("9876543210");
        availableIsbns.add("5555555555");

        // Add some example users
        users.add(new User("samaa", "123456"));
        users.add(new User("hala", "123456"));
        users.add(new User("malak", "123456"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isLoggedIn = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                isLoggedIn = true;
                break;
            }
        }

        if (isLoggedIn) {
            System.out.print("Enter the ISBN of the book: ");
            String isbn = scanner.nextLine();

            ReturnBook returnBook = new ReturnBook(isbn);
            returnBook.returnBook();
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        scanner.close();
    }

    private static class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}
