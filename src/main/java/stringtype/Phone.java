package stringtype;

import java.util.Scanner;

public class Phone {
    String type;
    int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Pnasonic", 20);
        Phone phone2 = new Phone("Nokia", 30);

        System.out.println(phone1.getType() + " " + phone1.getMem());
        System.out.println(phone2.getType() + " " + phone2.getMem());

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. telefon típusa: ");
        phone1.setType(scanner.nextLine());
        System.out.println("1. telefon memória : ");
        phone1.setMem(scanner.nextInt());
        scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("2. telefon típusa: ");
        phone2.setType(scanner.nextLine());
        System.out.println("2. telefon memória : ");
        phone2.setMem(scanner.nextInt());
        scanner.nextLine();

        System.out.println(phone1.getType() + " " + phone1.getMem());
        System.out.println(phone2.getType() + " " + phone2.getMem());

    }

}
