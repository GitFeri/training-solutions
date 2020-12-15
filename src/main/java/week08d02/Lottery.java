package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    public List<Integer> getNumbers(int interval, int numbers) {
        List<Integer> intervalNums = new ArrayList<>();
        for (int i = 0; i < interval; i++) {
            intervalNums.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int pos;
        Random rand = new Random();
        for (int i = 0; i < numbers; i++) {
            pos = rand.nextInt(intervalNums.size());
            result.add(intervalNums.get(pos));
            intervalNums.remove(pos);
        }
        return result;
    }

}
