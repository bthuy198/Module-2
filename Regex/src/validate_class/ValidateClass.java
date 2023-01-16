package validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Pattern pattern;
    private Matcher matcher;
    private final String NAME_REGEX = "^[CAP][0-9]{4}[GHIKLMN]$";
    public ValidateClass(){
    }
    public boolean validate(String regex){
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
