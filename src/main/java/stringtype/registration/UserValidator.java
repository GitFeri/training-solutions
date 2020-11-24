package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return (password1.length() >= 8) && (password1.equals(password2));
    }

    public boolean isValidEmail(String email) {
        int atPosition = email.indexOf("@");
        int dotPosition = email.indexOf('.');

        System.out.println(atPosition);
        System.out.println(dotPosition);

        return (atPosition > 0) && (dotPosition > atPosition + 1) && (dotPosition < email.length()-1);
    }

}
