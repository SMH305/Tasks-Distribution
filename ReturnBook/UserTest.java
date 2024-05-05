package ReturnBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testGetUsername() {
        String username = "samaa";
        String password = "123456";
        User user = new User(username, password);
        
        String actualUsername = user.getUsername();
        
        Assertions.assertEquals(username, actualUsername);
    }

    @Test
    public void testGetPassword() {
        String username = "samaa";
        String password = "123456";
        User user = new User(username, password);
        
        String actualPassword = user.getPassword();
        
        Assertions.assertEquals(password, actualPassword);
    }
}

