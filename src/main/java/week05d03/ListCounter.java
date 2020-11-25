package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {
    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        System.out.println(listCounter.startWithA(List.of("alma")));
    }

    public int startWithA(List<String> strings) {
        int count = 0;
        try {
            for (String str : strings) {
//              if ("aA".contains(str.substring(0, 1))) {
//              if (str.toLowerCase().charAt(0) == 'a') {
//              if (str.toLowerCase().startsWith("a")) {
//              if (str.regionMatches(true, 0, "a", 0, 1)) {
                if (Character.toLowerCase(str.charAt(0)) == 'a') {
                    count++;
                }
            }
        } catch (NullPointerException err) {
        } catch (StringIndexOutOfBoundsException err) {
        }
        return count;
    }
}

