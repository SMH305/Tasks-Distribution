package LoginHome;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class librarySystemTest {

    @Test
    public void displayBorrowedBooks() {

            User user1 = new User("admin", "password123", "Harry Potter, Alice in Wonderland");

            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            librarySystem.displayBorrowedBooks(user1);

        }

    }
