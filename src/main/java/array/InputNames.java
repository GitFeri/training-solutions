package array;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + 1 + ". név : ");
            names[i] = scanner.nextLine();
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
