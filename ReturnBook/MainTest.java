package ReturnBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    public void testMain_ValidCredentialsAndBookFound() {
        String input = "samaa\n123456\n1234567890\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(new Book("1234567890"));
        availableBooks.add(new Book("202105461"));
        availableBooks.add(new Book("00110011"));

        List<User> users = new ArrayList<>();
        users.add(new User("samaa", "123456"));
        users.add(new User("hala", "123456"));
        users.add(new User("malak", "123456"));

        Main.main(new String[0]);

        Assertions.assertEquals(3, availableBooks.size());
    }

    @Test
    public void testMain_InvalidCredentials() {
        String input = "samaa\npassword\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(new Book("1234567890"));
        availableBooks.add(new Book("202105461"));
        availableBooks.add(new Book("00110011"));

        List<User> users = new ArrayList<>();
        users.add(new User("samaa", "123456"));
        users.add(new User("hala", "123456"));
        users.add(new User("malak", "123456"));

        Main.main(new String[0]);

        Assertions.assertEquals(3, availableBooks.size());
    }
}