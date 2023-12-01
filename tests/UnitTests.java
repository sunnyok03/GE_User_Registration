
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

    @Test
    public void emailsTest(){
        UserRegistration user = new UserRegistration();
        String[] validEmails = {"abc@yahoo.com",  //true
                "abc-100@yahoo.com", // true
                "abc.100@yahoo.com", //true
                "abc111@abc.com", //true
                "abc-100@abc.net", //true
                "abc.100@abc.com.au",  //true
                "abc@1.com", // true
                "abc+100@gmail.com", // true
                };
        String[] invalidEmails = {"abc", // false
                "abc@.com.my", //false
                "abc123@gmail.a", //false
                "abc123@.com", //false
                "abc123@.com.com", //false
                ".abc@abc.com", //false
                "abc()*@gmail.com",//false
                "abc@%*.com",//false
                "abc..2002@gmail.com",//false
                "abc.@gmail.com",//false
                "abc@abc@gmail.com",//false
                "abc@gmail.com.1a",//false
                "abc@gmail.com.aa.au"};//false
        for(String email : validEmails){
            assertTrue(user.validateEmail(email));
        }
        for(String email : invalidEmails){
            assertFalse(user.validateEmail(email));
        }
    }
}
