import java.util.ArrayList;
import java.util.List;
//Business Layer
//Create Class for the Book
class Book {
    private String title;
    private String ISBN;
    private boolean isAvailable;
    private String borrower;
    public Book(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
        this.isAvailable = true;
        this.borrower = null;
    }
    //Get and Set Methods
    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public String getBorrower() {
        return borrower;
    }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
}
//Create Class for the Library
class Library {
    private List<Book> books;
    private List<User> users;
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
    // Add Books to the Book List
    public void addBook(Book book) {
        books.add(book);
    }
    // Borrow Book Method
    public boolean borrowBook(String title, String borrower) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    book.setBorrower(borrower);
                    return true;
                } else {
                    return false; //Return False when the Book is not available in the library
                }
            }
        }
        return false; // Book not found
    }
    // Method for authenticating the user based on its username and password
    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    // Add user to the User list
    public void addUser(User user) {
        users.add(user);
    }
}
//Creat Class for the User
class User {
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
