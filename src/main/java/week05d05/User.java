package week05d05;

import javax.naming.NameNotFoundException;
import java.util.IllegalFormatException;

public class User {
    String firstName;
    String lastName;
    String email;

    public User(String firstName, String lastName, String email) {
        int atPos = email.indexOf('@');
        int dotPos = email.indexOf('.');
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        if (email == null) {
            throw new NullPointerException("Null pointer");
        }

        if (!isEmailOk(email)) {
            throw new IllegalStateException("Wrong email");
        }
    }

    private boolean isEmailOk(String email) {
        int atPos = email.indexOf('@');
        int dotPos = email.indexOf('.');

        if (atPos < 1 || atPos + 1 >= dotPos || dotPos + 1 >= email.length()) {
            return false;
        }
        return true;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
