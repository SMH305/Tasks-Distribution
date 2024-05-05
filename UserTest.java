package LoginHome;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getUsername() {

            // Create a User instance
            User user = new User("admin", "password123", "Harry Potter, Alice in Wonderland");

            // Check if the username is correct
            assertEquals("admin", user.getUsername());

    }

    @Test
    public void getPassword() {

            // Create a User instance
            User user = new User("admin", "password123", "Harry Potter, Alice in Wonderland");

            // Check if the password is correct
            assertEquals("password123", user.getPassword());
    }


}