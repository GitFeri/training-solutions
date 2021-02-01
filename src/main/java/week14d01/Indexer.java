package week14d01;

import java.util.*;

public class Indexer {

    private Map<Character, List<String>> myList = new HashMap<>();

    public Map<Character, List<String>> index(List<String> names) {

        for (String name : names) {
            addNameToMap(name.charAt(0), name);
        }
        return myList;
    }

    private void addNameToMap(Character character, String name) {
        if (!myList.containsKey(character)) {
            myList.put(character, new ArrayList());
        }
        myList.get(character).add(name);
    }

}