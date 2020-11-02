package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Első időpont: ");

        System.out.println("Óra : ");
        int h = scanner.nextInt();
        scanner.nextLine();

        System.out.println("perc : ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("másodperc : ");
        int s = scanner.nextInt(); scanner.nextLine();

        Time time1 = new Time(h,m,s);

        System.out.println("Második időpont: ");

        System.out.println("Óra : ");
        h = scanner.nextInt();
        scanner.nextLine();

        System.out.println("perc : ");
        m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("másodperc : ");
        s = scanner.nextInt(); scanner.nextLine();

        Time time2 = new Time(h,m,s);

        //

        System.out.println("Az első időpont " + time1.toString() + " = " + time1.getInMinutes());
        System.out.println("A második időpont " + time2.toString() + " = " + time2.getInSeconds());
        System.out.println("Az első korábbi, mint a második : " + time1.earlierThan(time2));

    }
}
