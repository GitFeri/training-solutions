package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    Random rand;

    public Lottery(int seed) {
        rand = new Random(seed);
    }

    public Lottery() {
        rand = new Random();
    }

    int seed;

    public List<Integer> getNumbers(int interval, int numbers) {
        List<Integer> intervalNums = new ArrayList<>(interval);
        for (int i = 0; i < interval; i++) {
            intervalNums.add(i+1);
        }

        List<Integer> result = new ArrayList<>(numbers);
        int pos;
        for (int i = 0; i < numbers; i++) {
            pos = rand.nextInt(intervalNums.size());
            result.add(intervalNums.get(pos));
            intervalNums.remove(pos);
        }
        return result;
    }

}
