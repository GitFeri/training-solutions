package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharOperations {
    public CharOperations() {
    }

    public List<Integer> getPositionOfChar(String base, String part) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<base.length();i++) {
            if (base.charAt(i) == part.charAt(0)) {
                result.add(i);
            }
        }
    return result;
    }
}

