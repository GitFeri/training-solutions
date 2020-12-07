package week07d01;

public class MathAlgorithms {
    public MathAlgorithms() {
    }

    public static boolean isPrime(int x) {

        if (x <= 0) {
            throw new IllegalArgumentException("May not be zero or negative.");
        }

        if (x == 1) {
            return false;
        }

        int max = 1 + (int) Math.sqrt(x);
        for (int i = 2; i <= max; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
