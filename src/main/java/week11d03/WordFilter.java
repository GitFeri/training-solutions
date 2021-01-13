package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {

        List<String> filteredWords = new ArrayList<>();

        if (words != null) {
            for (String word : words) {
                if (word.indexOf(c) >= 0) {
                    filteredWords.add(word);
                }
            }
        }
        return filteredWords;
    }
}
