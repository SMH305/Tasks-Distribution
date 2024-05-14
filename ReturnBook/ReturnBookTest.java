package ReturnBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReturnBookTest {
    @Test
    public void testReturnBook_BookFound() {
        String isbn = "1234567890";
        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(new Book(isbn));
        availableBooks.add(new Book("202105461"));
        availableBooks.add(new Book("00110011"));

        ReturnBook returnBook = new ReturnBook(isbn);

        returnBook.returnBook(availableBooks);

        Assertions.assertEquals(3, availableBooks.size());
    }

    @Test
    public void testReturnBook_BookNotFound() {
        String isbn = "9876543210";
        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(new Book("1234567890"));
        availableBooks.add(new Book("202105461"));
        availableBooks.add(new Book("00110011"));

        ReturnBook returnBook = new ReturnBook(isbn);

        returnBook.returnBook(availableBooks);

        Assertions.assertEquals(3, availableBooks.size());
    }
}