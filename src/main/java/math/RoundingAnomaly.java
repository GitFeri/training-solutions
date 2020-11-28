package math;

import java.util.Random;

public class RoundingAnomaly {
    private final static int RUN_TIMES = 100;
    private final static int MAX_INDEX = 1000;
    private final static double MAX_RND = 1000000;

    public static void main(String[] args) {
        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();
        double sum = 0.0;
        for (int i = 0; i < RUN_TIMES; i++) {
            sum += roundingAnomaly.difference(MAX_INDEX, MAX_RND, 5);
        }

        System.out.println("Átlag : " + sum / RUN_TIMES);
    }

    public double[] randomNumbers(int size, double max, int scale) {
        double[] numbers = new double[size];
        Double dec = Math.pow(10, scale);
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = Math.round(dec * rnd.nextDouble() * max) / dec;
        }
        return numbers;
    }

    public double roundAfterSum(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return Math.round(sum);
    }

    public double sumAfterRound(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += Math.round(num);
        }
        return sum;
    }

    public double difference(int size, double max, int scale) {
        double [] nums = randomNumbers(size,max,scale);
        double rndAfterSum = roundAfterSum(nums);
        double sumAfterRnd = sumAfterRound(nums);
        return Math.abs(rndAfterSum - sumAfterRnd);
    }
}
