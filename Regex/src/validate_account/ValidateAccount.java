package validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern;
    private Matcher matcher;
    private final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public ValidateAccount(){
    }
    public boolean validate(String regex){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
