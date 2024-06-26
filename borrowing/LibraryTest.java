

package borrowing;

import org.junit.*;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    // Here it will test addBook to the library method of the Library class
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Data Analysis and Algorithms", "9782000183198");

        library.addBook(book);

        assertTrue(library.borrowBook("Data Analysis and Algorithms", "Samaa"));
    }

    @Test
    // Here it will test borrowBook method in the Library class
    // to verify the successfull and unsuccessfull book borrowing
    public void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("Data Analysis and Algorithms", "9782000183198");
        library.addBook(book);

        assertTrue(library.borrowBook("Data Analysis and Algorithms", "Samaa"));

        assertFalse(library.borrowBook("Data Analysis and Algorithms", "Samaa"));
    }

    @Test
    // Here it will test and verify the authintecateUser method in Library class
    public void testAuthenticateUser() {
        Library library = new Library();
        User user = new User("Malak", "1234");
        library.addUser(user);

        assertEquals(user, library.authenticateUser("Malak", "1234"));

        assertNull(library.authenticateUser("Malak", "5678"));

        assertNull(library.authenticateUser("Samaa", "1234"));
    }
}
