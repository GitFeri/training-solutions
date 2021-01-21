package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public List<Integer> getIndexesOfChar(String string, char ch) {
        List<Integer> charPos = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                charPos.add(i);
            }
        }
        return charPos;
    }
}
