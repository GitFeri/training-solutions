package week07d03;

import java.util.List;

public class NumberList {
    public static boolean isIncreasing(List<Integer> integers) {
        for (int i=1; i<integers.size(); i++) {
            if (integers.get(i-1).intValue() > integers.get(i).intValue()) {
                return false;
            }
        }
        return true;
    }
}
