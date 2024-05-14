package ReturnBook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testGetIsbn() {
        String isbn = "1234567890";
        Book book = new Book(isbn);

        // Test the getIsbn() method
        // The expected output is the same as the provided ISBN
        assertEquals(isbn, book.getIsbn());
    }

    @Test
    public void testSetIsbn() {
        String isbn = "1234567890";
        Book book = new Book("0000000000");

        // Test the setIsbn() method
        book.setIsbn(isbn);

        // The expected output is the updated ISBN value
        assertEquals(isbn, book.getIsbn());
    }
}
