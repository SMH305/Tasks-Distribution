package ReturnBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    private List<Book> availableBooks;
    private List<User> users;

    @BeforeEach
    public void setup() {
        availableBooks = new ArrayList<>();
        availableBooks.add(new Book("1234567890", "Software Engineering Project", "Ian Sommerville"));
        availableBooks.add(new Book("202105461", "Database Management", "Hector Garcia"));
        availableBooks.add(new Book("00110011", "Analysis and Design of Algorithms", "Rajesh K. Shukla"));

        users = new ArrayList<>();
        users.add(new User("samaa", "123456"));
        users.add(new User("hala", "123456"));
        users.add(new User("malak", "123456"));
    }

    @Test
    public void testMain_ValidCredentialsAndBookFound() {
        String input = "samaa\n123456\n1234567890\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(new String[0]);

        Assertions.assertEquals(3, availableBooks.size());
    }
  // new test  to test the case when the entered password is incorrect (updated after review)
    @Test
    public void testMain_InvalidCredentials() {
        String input = "samaa\npassword\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[0]);

        Assertions.assertEquals(3, availableBooks.size());
    }
// to test the case when the entered ISBN is not found in the available books list.(udpated after review)
    @Test
    public void testMain_ValidCredentialsAndBookNotFound() {
        String input = "samaa\n123456\n9876543210\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[0]);

        Assertions.assertEquals(3, availableBooks.size());
    }
}