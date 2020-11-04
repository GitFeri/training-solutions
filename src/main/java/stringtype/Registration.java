package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String userName;
        String password1,password2;
        String eMail;

        UserValidator userValidator = new UserValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Felhasználó neve: ");
        userName = scanner.nextLine();
        System.out.println("Jelszó: ");
        password1 = scanner.nextLine();
        System.out.println("Jelszó ismét : ");
        password2 = scanner.nextLine();
        System.out.println("email : ");
        eMail = scanner.nextLine();

        System.out.println("Név   : " + userValidator.isValidUsername(userName));
        System.out.println("Jelszó: " + userValidator.isValidPassword(password1,password2));
        System.out.println("eMail : " + userValidator.isValidEmail(eMail));


    }

}
