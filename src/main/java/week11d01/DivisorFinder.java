package week11d01;

public class DivisorFinder {

    public static int findDivisors(int n) {
        int numbers = n;
        int result = 0;
        int oneNum;

        while (numbers > 0) {
            oneNum = numbers % 10;
            if (oneNum != 0) {
                if (n % oneNum == 0) {
                    result++;
                }
            }
            numbers = numbers / 10;
        }

        return result;
    }
}
