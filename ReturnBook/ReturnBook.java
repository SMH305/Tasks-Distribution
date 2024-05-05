package ReturnBook;

import java.util.List;

public class ReturnBook {
    private String isbn;

    public ReturnBook(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void returnBook(List<Book> availableBooks) {
        boolean bookFound = false;
        for (Book book : availableBooks) {
            if (book.getIsbn().equals(isbn)) {
                bookFound = true;
                break;
            }
        }

        if (bookFound) {
            System.out.println("Book with ISBN " + isbn + " has been returned.");
        } else {
            System.out.println("Book with ISBN " + isbn + " is not available.");
        }
    }
}