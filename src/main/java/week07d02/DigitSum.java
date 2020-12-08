package week07d02;

public class DigitSum {
    public static int sumOfDigits(int x) {
        String xString = "" + x;
        int sum = 0;
        for (int i = 0; i < xString.length(); i++) {
            sum += xString.codePointAt(i)-48;
        }
        return sum;
    }
}
