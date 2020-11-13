package week03;

import java.util.Scanner;

public class Operation {
    int leftOperand;
    int rightOperand;

    public Operation(String input) {
        int posOfPlus = input.indexOf("+");
        leftOperand = Integer.parseInt(input.substring(0,posOfPlus).trim());
        rightOperand = Integer.parseInt(input.substring(posOfPlus+1).trim());
    }

    public int GetResult() {
        return leftOperand + rightOperand;
    }

    public static void main(String[] args) {
        System.out.println("Kérem adja meg a kifejezést : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Eredmény : " + new Operation(input).GetResult());
    }
}
