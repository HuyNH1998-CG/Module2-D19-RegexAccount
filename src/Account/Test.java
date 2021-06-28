package Account;

public class Test {
    private static AccountPattern accountPattern;
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        accountPattern = new AccountPattern();
        for (String ac : validAccount){
            boolean isValid = accountPattern.validate(ac);
            System.out.println(ac + " is valid: " + isValid);
        }
        for (String ac : invalidAccount){
            boolean isValid = accountPattern.validate(ac);
            System.out.println(ac + " is valid: " + isValid);
        }
    }
}
