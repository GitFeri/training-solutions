package week13d05;

import java.util.HashSet;
import java.util.Set;

public class CharCounter {

    public int numOfChar(String s ) {
        Set<Character> chars = new HashSet<>();
        char[] charArray = s.toLowerCase().toCharArray();
        for (char c : charArray) {
            if ('a' <= c && c <= 'z') {
                chars.add(c);
            }
        }

        return chars.size();
    }
}
