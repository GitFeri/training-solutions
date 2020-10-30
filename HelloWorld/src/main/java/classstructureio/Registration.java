package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Regisztrációs név megadása:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("email cím : ");
        String email = scanner.nextLine();

        System.out.println("A megadott regisztrációs adatok:");
        System.out.println("Név  : " + name);
        System.out.println("email: " + email);
    }
}
