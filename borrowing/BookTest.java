
package borrowing;
import org.junit.*;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    // Here it will test the book constructor and check if the book attributes are intialized correctly
    public void testBookConstructor() {
        Book book = new Book("DataBase Management", "9782000183198");

        assertEquals("DataBase Management", book.getTitle());
        assertEquals("9782000183198", book.getISBN());
        assertTrue(book.isAvailable());
        assertNull(book.getBorrower());
    }

    @Test
    // Here it will test setAvailable method in the Book class (set the book as available and unavailable)
    public void testSetAvailable() {
        Book book = new Book("Software Engineering Project", "9783540626251");

        book.setAvailable(false);
        assertFalse(book.isAvailable());

        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    @Test
    // Here it will test setBorrower method in Book class
    public void testSetBorrower() {
        Book book = new Book("Data Analysis and Algorithms", "9782000183198");

        book.setBorrower("Samaa");
        assertEquals("Samaa", book.getBorrower());

        book.setBorrower(null);
        assertNull(book.getBorrower());
    }
}
