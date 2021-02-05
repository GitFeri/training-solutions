package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Hachiko {

    public Map<String, Integer> countWords(String fileName, String... words) {
        Map<String, Integer> wordsCounts = initMap(words);
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName), Charset.forName("windows-1250"))) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(wordsCounts, line, words);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found!");
        }
        return wordsCounts;
    }

    private Map<String, Integer> initMap(String... words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.put(word, 0);
        }
        return result;
    }

    private void processLine(Map<String, Integer> wordsCounts, String line, String... words) {
        for (String word : words) {
            if (line.contains(word)) {
                processWord(wordsCounts, word);
            }
        }
    }

    private void processWord(Map<String, Integer> wordsCounts, String word) {
        if (wordsCounts.containsKey(word)) {
            int value = wordsCounts.get(word);
            wordsCounts.replace(word, ++value);
        }
    }

}
