package validate_email;

public class Test {
    private static ValidateEmail validateEmail;
    public static  final String[] validEmail = new String[] {"a@gmail.com","ab@yahoo.com","abc@hotmail.com"};
    public static  final String[] inValidEmail = new String[] {"@gmail.com","ab@yahoo.","@#abc@hotmail.com"};
    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for(String email : validEmail){
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for(String email : inValidEmail){
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
