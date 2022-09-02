public class Validate{

    @FunctionalInterface
     interface validate {
        boolean validateName(String name);
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
        boolean isValidFirstName = Validate.validateFirstName().validateName("Shekhar");
        System.out.println(isValidFirstName);

        boolean isInavalidFirstName = Validate.validateFirstName().validateName("sddsa");
        System.out.println(isInavalidFirstName);

        boolean isValidLastName = Validate.validateLastName().validateName("Jha");
        System.out.println(isValidLastName);

        boolean isInavalidLastName = Validate.validateLastName().validateName("sddwsa");
        System.out.println(isInavalidLastName);

        boolean isValidEmail = Validate.validateEmail().validateName("shek-asd@gmail.co1.in");
        System.out.println(isValidEmail);

        boolean isInValidEmail = Validate.validateEmail().validateName("shek-asd122@gmail.co1.in.");
        System.out.println(isInValidEmail);

        boolean isValidPhoneNo = Validate.validatePhoneNO().validateName("91 1234567890");
        System.out.println(isValidPhoneNo);

        boolean isInValidPhoneNo = Validate.validatePhoneNO().validateName("91211234567890");
        System.out.println(isInValidPhoneNo);

        boolean isValidPassword = Validate.validatePassword().validateName("Shekhar@_12");
        System.out.println(isValidPassword);

        boolean isInValidPassword = Validate.validatePassword().validateName("Shekhar12");
        System.out.println(isInValidPassword);


    } }