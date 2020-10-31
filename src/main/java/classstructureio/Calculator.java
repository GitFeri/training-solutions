package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Első szám   : ");
        int elso = scanner.nextInt();
        System.out.println("Második szám: ");
        int masodik = scanner.nextInt();

        System.out.println(elso + "+" + masodik);
        System.out.println(elso + masodik);

    }
}
