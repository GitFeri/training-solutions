package week07d02;

import java.lang.reflect.Array;

public class DigitSum {
    public static int sumOfDigits(int x) {
        String xString = "" + x;
        int sum = 0;
        for (int i = 0; i < xString.length(); i++) {
            sum += xString.codePointAt(i) - 48;
        }
        return sum;
    }

    public static int sumOfDigitsOther(int x) {
        String xString = "" + x;
        byte[] bytes = xString.getBytes();
        int sum = 0;
        for (int i = 0; i < bytes.length; i++) {
            sum += bytes[i] - 48;
        }
        return sum;
    }

}
