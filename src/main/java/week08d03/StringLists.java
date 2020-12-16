package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public static List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();

        for (String oneStr : first) {
            if (!result.contains(oneStr)) {
                result.add(oneStr);
            }
        }

        for (String oneStr : second) {
            if (!result.contains(oneStr)) {
                result.add(oneStr);
            }
        }

        return result;
    }
}

