package validate_phonenumber;

public class Main {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        String[] phoneNumbers = new String[]{"(84)-(0978489648)", "(a8)-(02222222)"};
        for(String number : phoneNumbers){
            boolean isValid = validatePhoneNumber.validate(number);
            System.out.println(number + " is validate phone number: " + isValid);
        }
    }
}
