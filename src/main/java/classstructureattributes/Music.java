package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Előadó    :");
        song.band = scanner.nextLine();
        System.out.println("Zene címe :");
        song.title = scanner.nextLine();
        System.out.println("Hossza    :");
        song.length = scanner.nextInt();

        System.out.println("Előadó   : " + song.band);
        System.out.println("Cím      : " + song.title);
        System.out.println("Hossz    : " + song.length);
    }
}
