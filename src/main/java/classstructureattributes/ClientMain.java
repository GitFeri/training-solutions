package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ügyfél neve  :");
        client.name = scanner.nextLine();
        System.out.println("Születési éve:");
        client.year = scanner.nextInt();
        client.address = scanner.nextLine(); // sorvége beolvasás ...
        System.out.println("Ügyfél címe  :");
        client.address = scanner.nextLine();

        System.out.println();
        System.out.println("Ügyfél neve   : " + client.name);
        System.out.println("Születési éve : " + client.year);
        System.out.println("Ügyfél címe   : " + client.address);

    }
}
