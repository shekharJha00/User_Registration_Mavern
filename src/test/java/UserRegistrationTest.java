


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegistrationTest {

    @Test
    public void givenCorrectDetailsReturnHappy() {
        UserRegistration validate = new UserRegistration();
        String result = validate.userRegistrationValidation("Shekhar","Jha","shekharJhaa@gmail.co.in","91 1234567890","jShekhar@1");
        assertEquals("Happy", result);
    }
    @Test
    public void givenIncorrectDetailsReturnSad() {
        UserRegistration validate = new UserRegistration();
        String result = validate.userRegistrationValidation("shekhar","jha","aman-xs@@gmail.co.in1","919087654321","dasasd@1");
        assertEquals("Sad", result);
    }
}

