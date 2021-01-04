package week09d02;

public class FibCalculator {

    private int fibNum = 1;
    private int fibPrevious = 1;
    private int fibBeforePrevious = 0;

    public long sumEvens(int bound) {
        long sum = 0;
        while (fibNum <= bound) {
            if (fibNum % 2 == 0) {
                sum += fibNum;
            }
            setNextFibNumber();
        }
        return sum;
    }

    private void setNextFibNumber() {
        fibBeforePrevious = fibPrevious;
        fibPrevious = fibNum;
        fibNum = fibPrevious + fibBeforePrevious;
    }
}
