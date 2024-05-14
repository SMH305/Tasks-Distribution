

package ReturnBook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testGetIsbn() {
        String isbn = "1234567890";
        Book book = new Book(isbn, "Sample Title", "Sample Author");

        // Test the getIsbn() method
        // The expected output is the same as the provided ISBN
        assertEquals(isbn, book.getIsbn());
    }

    @Test
    public void testSetIsbn() {
        String isbn = "1234567890";
        Book book = new Book("0000000000", "Sample Title", "Sample Author");

        // Test the setIsbn() method
        book.setIsbn(isbn);

        // The expected output is the updated ISBN value
        assertEquals(isbn, book.getIsbn());
    }

    @Test
    public void testGetTitle() {
        String title = "Sample Title";
        Book book = new Book("1234567890", title, "Sample Author");

        // Test the getTitle() method // (updated after review)
        // The expected output is the same as the provided title
        assertEquals(title, book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        String author = "Sample Author";
        Book book = new Book("1234567890", "Sample Title", author);

        // Test the getAuthor() method // (updated after review)
        // The expected output is the same as the provided author
        assertEquals(author, book.getAuthor());
    }
}

