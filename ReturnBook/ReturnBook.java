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
        Book returnedBook = null;
        for (Book book : availableBooks) {
            if (book.getIsbn().equals(isbn)) {
                returnedBook = book;
                break;
            }
        }

        if (returnedBook != null) {

            // Generate the return receipt if the book returned successfully (updated aftar review)
            String receipt =
                    "Title: " + returnedBook.getTitle() + "\n"
                    + "Author: " + returnedBook.getAuthor() + "\n"
                    + "ISBN: " + returnedBook.getIsbn() + "\n"
                    +"Short Description: " + returnedBook.getTitle() + " Book has been returned successfully." ;

            System.out.println("Book with ISBN " + isbn + " has been returned." + "\n");
            System.out.println("Return Receipt:\n" + receipt);
        } else {
            System.out.println("Book with ISBN " + isbn + " is not available.");
        }
    }
}

