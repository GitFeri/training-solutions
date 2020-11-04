package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        String name;
        int year;
        int month;
        int day;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dolgozó neve: ");
        name = scanner.nextLine();
        System.out.println("Születési év:");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Születés hónap:");
        month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Születés napja:");
        day = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Dolgozó neve     : " + employee.getName());
        System.out.println("Születés ideje   : " + employee.getDateOfBirth());
        System.out.println("Felvétel ideje   : " + employee.getBeginEmployment());
    }
}
