
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{1,2} [0-9]{10}";
    private static final String PASSWORD_PATTERN = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";
    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        if (!pattern.matcher(firstName).matches()) {
            throw new CustomException("Invalid First Name ", CustomException.ExceptionType.INVALID_FIRST_NAME);
        }
        return true;
    }
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        if (!pattern.matcher(lastName).matches()) {
            throw new CustomException("Invalid Last Name ", CustomException.ExceptionType.INVALID_LAST_NAME);
        }
        return true;
    }
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        if (!pattern.matcher(email).matches()) {
            throw new CustomException("Invalid email ", CustomException.ExceptionType.INVALID_EMAIL);
        }
        return true;
    }
    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        if (!pattern.matcher(phoneNumber).matches()) {
            throw new CustomException("Invalid Mobile Number ", CustomException.ExceptionType.INVALID_MOBILE_NUMBER);
        }
        return true;
    }
    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if (!pattern.matcher(password).matches()) {
            throw new CustomException("Invalid Password ", CustomException.ExceptionType.INVALID_PASSWORD);
        }
        return true;
    }
    public String userRegistrationValidation(String firstName, String lastName, String email, String phoneNumber, String password) {
        if (validateFirstName(firstName) && validateLastName(lastName) && validateEmail(email) && validatePhoneNumber(phoneNumber) && validatePassword(password)) {
            return "Happy";
        } else {
            return "Sad";
        }
    }
}
