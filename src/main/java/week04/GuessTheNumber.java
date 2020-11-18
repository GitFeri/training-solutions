package week04;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int number;

    public GuessTheNumber() {
        this.number = (int) (Math.random() * (100) + 1);
//        Random random = new Random();
//        int number = random.nextInt(100)+1;
    }

    public int askNumber() {
        System.out.println("adj meg egy számot: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }

    public void asks() {
        int userNum;
        int count = 6;
        System.out.println("Gondoltam egy számot, találd ki!");
        do {
            userNum = askNumber();
            count--;
            if (userNum > number) {
                System.out.println("Ennél kisebb számra gondoltam.");

            }
            if (userNum < number) {
                System.out.println("Ennél nagyobb számra gondoltam.");
            }
        } while (!(userNum == number || count == 0));

        if (userNum == number) {
            System.out.println("Eltatláltad, erre gondoltam.");
        } else if (count == 0) {
            System.out.println("Sajnos elfogyott a lehetőséged...");
        }
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        //System.out.println("Erre gondoltam: " + guessTheNumber.getNumber());
        guessTheNumber.asks();
    }


}
