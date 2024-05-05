package borrowing;

import org.junit.*;

import static org.junit.Assert.*;

public class UserTest {
    // Here it will test the user constructor and check if the user 
    //attributes are sets and  intialized correctly
    @Test
    public void testUserConstructor() {
        User user = new User("Malak", "1234");

        assertEquals("Malak", user.getUsername());
        assertEquals("1234", user.getPassword());
    }
}
