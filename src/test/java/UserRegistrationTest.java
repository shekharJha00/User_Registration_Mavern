
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegistrationTest {
    @Test
    public void givenProperFirstNameShouldReturnTrue() {
        boolean result = UserRegistration.validateFirstName("Shekhar");
        Assert.assertTrue(result);
    }
    @Test
    public void givenImproperFirstNameShouldReturnInvalidMessage() {
        try {
            new UserRegistration();
            UserRegistration.validateFirstName("shekhar");
        } catch (CustomException e) {
            Assert.assertEquals(CustomException.ExceptionType.INVALID_FIRST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperLastNameShouldReturnTure() {
        boolean result = UserRegistration.validateLastName("Jha");
        Assert.assertTrue(result);
    }
    @Test
    public void givenImproperLastNameShouldReturnInvalidMessage() {
        try {
            new UserRegistration();
            UserRegistration.validateLastName("Jha");
        } catch (CustomException e) {
            Assert.assertEquals(CustomException.ExceptionType.INVALID_LAST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperEmailShouldReturnTure() {
        boolean result = UserRegistration.validateEmail("shek-asd@gmail.co1.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenImproperEmailShouldReturnInvalidMessage() {
        try {
            new UserRegistration();
            UserRegistration.validateEmail("shek-sadad@gmail.co.in1");
        } catch (CustomException e) {
            Assert.assertEquals(CustomException.ExceptionType.INVALID_EMAIL, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPhoneNumberShouldReturnTure() {
        boolean result = UserRegistration.validatePhoneNumber("91 1234567890");
        Assert.assertTrue(result);
    }
    @Test
    public void givenImproperPhoneNumberShouldReturnInvalidMessage() {
        try {
            new UserRegistration();
            UserRegistration.validatePhoneNumber("9113123112313");
        } catch (CustomException e) {
            Assert.assertEquals(CustomException.ExceptionType.INVALID_MOBILE_NUMBER, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPasswordShouldReturnTure() {
        boolean result = UserRegistration.validatePassword("SADdsa@1");
        Assert.assertTrue(result);
    }
    @Test
    public void givenImproperPasswordShouldReturnInvalidMessage() {
        try {
            new UserRegistration();
            UserRegistration.validatePassword("Asad@1");
        } catch (CustomException e) {
            Assert.assertEquals(CustomException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

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

