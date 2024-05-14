

package borrowing;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

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
                    return false; // Return False when the Book is not available in the library
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