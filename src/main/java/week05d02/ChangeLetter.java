package week05d02;

import java.util.ArrayList;
import java.util.List;

public class ChangeLetter {
    String changeVowels(String s) {
        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if ("euioaEUIOA".contains(s.substring(i,i+1))) {
                chars[i] = '*';
            } else
                chars[i] = s.charAt(i);
        }

        return String.valueOf(chars);
    }
}
