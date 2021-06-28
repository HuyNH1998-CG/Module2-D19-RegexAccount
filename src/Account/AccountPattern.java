package Account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountPattern {
    private static final String accountRegex = "^[_a-z0-9]{6,}$";

    public AccountPattern(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(accountRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
