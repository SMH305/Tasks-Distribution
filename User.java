package LoginHome;


public class User {
    private String username;
    private String password;
    private String borrowedBooks;

    public User(String username, String password, String borrowedBooks) {
        this.username = username;
        this.password = password;
        this.borrowedBooks = borrowedBooks;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
