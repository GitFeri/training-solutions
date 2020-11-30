package numbers;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Első kör átmérője : ");
        int diameter = scanner.nextInt();
        Circle circle1 = new Circle(diameter);
        scanner.nextLine();

        System.out.print("\nmásik kör átmérője: ");
        diameter = scanner.nextInt();
        Circle circle2 = new Circle(diameter);
        scanner.nextLine();

        System.out.println("Első    kör kerülete : " + circle1.perimeter());
        System.out.println("Első    kör területe : " + circle1.area());
        System.out.println("Második kör kerülete : " + circle2.perimeter());
        System.out.println("Második kör területe : " + circle2.area());
    }
}
