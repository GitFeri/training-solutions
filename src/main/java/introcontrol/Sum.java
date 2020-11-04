package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        numbers[0] = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Kérem a számot " + i + ". : ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
            numbers[0] += numbers[i];
        }

        System.out.println("A számok összege: " + numbers[0]);
    }
}
