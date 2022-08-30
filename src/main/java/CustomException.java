public class CustomException extends RuntimeException {
    enum ExceptionType {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_MOBILE_NUMBER, INVALID_PASSWORD
    }
    ExceptionType exceptionType;
    public CustomException(String message, ExceptionType exceptionType) {
        super(message);
        this.exceptionType = exceptionType;
    }
}

