package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("kérek egy számot: ");
        i = scanner.nextInt();
        if (i > 100) {
            System.out.println("nagyobb. mint száz");
        } else {
            System.out.println("száz, vagy kisebb");
        }

    }
}
