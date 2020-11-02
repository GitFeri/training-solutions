package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        System.out.println("Adj meg egy egész számot ! ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println(i % 3 == 0 ? "A szám oszható hárommal." : "A szám nem oszható hárommal.");

    }
}
