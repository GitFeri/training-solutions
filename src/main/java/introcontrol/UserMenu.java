package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi Kilépés");
        i = scanner.nextInt();
        if (i == 1) {
            System.out.println("Felhasználók listázása");
        } else {
            if (i == 2) {
                System.out.println("Felhasználó felvétele");
            }
        }

    }
}
