package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CovidFromIndex {
    public int WordInFileLine(String word, String fileName) {
        Path file = Path.of(fileName);
        int numberOfWord = 0;
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    numberOfWord++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return numberOfWord;
    }
}
