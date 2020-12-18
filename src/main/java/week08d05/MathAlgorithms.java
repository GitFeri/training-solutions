package week08d05;

public class MathAlgorithms {
    public static int greatestCommonDivisor(int a, int b) {
        int max = a;
        if (b < a) {
            max = b;
        }
        while (max >= 1) {
            if (a % max == 0 && b % max == 0) {
                return max;
            } else {
                max--;
            }
        }
        return 1;
    }
}
