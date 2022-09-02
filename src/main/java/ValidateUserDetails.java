public class ValidateUserDetails {

    @FunctionalInterface
     interface validate {
        boolean validateDetails(String details);
    }

    
    public static validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z][a-z]{2,}");
    }


    public static validate validateLastName() {
        return lastName -> lastName.matches("^[A-Z][a-z]{2,}");

    }
    public static validate validateEmail(){
        return email -> email.matches("^[a-z0-9]+([.+_-]?[a-z0-9]+)?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}");

    }
    public static validate validatePhoneNO(){
        return phoneNo -> phoneNo.matches("^[0-9]{1,2} [0-9]{10}");

    }
    public static validate validatePassword(){
        return password -> password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]).{8,}");
    }

    public static void main(String[] args) {
        boolean isValidFirstName = ValidateUserDetails.validateFirstName().validateDetails("Shekhar");
        System.out.println(isValidFirstName);

        boolean isInavalidFirstName = ValidateUserDetails.validateFirstName().validateDetails("sddsa");
        System.out.println(isInavalidFirstName);

        boolean isValidLastName = ValidateUserDetails.validateLastName().validateDetails("Jha");
        System.out.println(isValidLastName);

        boolean isInavalidLastName = ValidateUserDetails.validateLastName().validateDetails("sddwsa");
        System.out.println(isInavalidLastName);

        boolean isValidEmail = ValidateUserDetails.validateEmail().validateDetails("shek-asd@gmail.co1.in");
        System.out.println(isValidEmail);

        boolean isInValidEmail = ValidateUserDetails.validateEmail().validateDetails("shek-asd122@gmail.co1.in.");
        System.out.println(isInValidEmail);

        boolean isValidPhoneNo = ValidateUserDetails.validatePhoneNO().validateDetails("91 1234567890");
        System.out.println(isValidPhoneNo);

        boolean isInValidPhoneNo = ValidateUserDetails.validatePhoneNO().validateDetails("91211234567890");
        System.out.println(isInValidPhoneNo);

        boolean isValidPassword = ValidateUserDetails.validatePassword().validateDetails("Shekhar@_12");
        System.out.println(isValidPassword);

        boolean isInValidPassword = ValidateUserDetails.validatePassword().validateDetails("Shekhar12");
        System.out.println(isInValidPassword);


    } }