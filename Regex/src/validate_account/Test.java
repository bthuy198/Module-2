package validate_account;

public class Test {
    private static ValidateAccount validateAccount;
    private static String[] validateAcc = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefg"};
    private static String[] inValidateAcc = new String[]{".@","12345", "1234_", "abcde"};

    public static void main(String[] args) {
        validateAccount = new ValidateAccount();
        for(String acc : validateAcc){
            boolean isValid = validateAccount.validate(acc);
            System.out.println("Account " + acc + " is valid: " + isValid);
        }
        for(String acc : inValidateAcc){
            boolean isValid = validateAccount.validate(acc);
            System.out.println("Account " + acc + " is valid: " + isValid);
        }
    }
}
