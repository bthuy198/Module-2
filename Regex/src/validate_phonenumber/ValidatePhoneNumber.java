package validate_phonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String NUMBER_REGEX = "^[(]?[0-9]{2}[)]?[-][(]?[0][0-9]{9}[)]?$";
    public ValidatePhoneNumber(){
    }
    public boolean validate(String regex){
        pattern = Pattern.compile(NUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
