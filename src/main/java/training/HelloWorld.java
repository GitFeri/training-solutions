package training;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what's your name?");
        String name = scanner.nextLine();
        System.out.println(name);

    }
}
