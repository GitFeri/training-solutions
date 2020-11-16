package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {
    public int max(List<Integer> integers) {
        int max = Integer.MIN_VALUE;
        for (Integer i : integers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
