
import com.bridgelabz.UserRegistration;
import org.junit.Test;

import static org.junit.Assert.*;
public class UnitTests {
    @Test
    public void happyTest(){
        UserRegistration user = new UserRegistration();
        assertTrue(user.validateFirstName("Ram"));
        assertTrue(user.validateLastName("Kumar"));
        assertTrue(user.validateEmail("abc.xyz@bl.co.in"));
        assertTrue(user.validatePhone("91 0101010101"));
        assertTrue(user.validatePassword("A1@bcdef"));

    }

    @Test
    public void sadTest(){
        UserRegistration user = new UserRegistration();
        assertFalse(user.validateFirstName("shyam"));
        assertFalse(user.validateLastName("kumar"));
        assertFalse(user.validateEmail(".abc@abc.com"));
        assertFalse(user.validatePhone("91 0101001"));
        assertFalse(user.validatePassword("abd@skdk"));
    }
}
