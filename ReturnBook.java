import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturnBook {

    //get isbn from user
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
    // message to tell the user if book is return or not 
    public void returnBook() {
        if (availableIsbns.contains(isbn)) {
            System.out.println("Book with ISBN " + isbn + " has been returned.");
           
        } else {
            System.out.println("Book with ISBN " + isbn + " is not available.");
        }
    }

    public static void main(String[] args) {
        // random isbn  
        availableIsbns.add("1234567890");
        availableIsbns.add("202105461");
        availableIsbns.add("00110011");

        // random username and password 
        users.add(new User("samaa", "123456"));
        users.add(new User("hala", "123456"));
        users.add(new User("malak", "123456"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

          // check the username and password 
        boolean isLoggedIn = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                isLoggedIn = true;
                break;
            }
        }
          // if user  login successfully the system will enable to the user to enter isbn and return book 
        if (isLoggedIn) {
            System.out.print("Enter the ISBN of the book: ");
            String isbn = scanner.nextLine();

            ReturnBook returnBook = new ReturnBook(isbn);
            returnBook.returnBook();
        }
        
        // message if login is invalid 
        else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
   // get username and password 
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
