package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class CityFinder {
    private String maxLengthCity = "";

    public String longestCity(String fileName) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
            return findMaxLengthCity(bufferedReader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    private String findMaxLengthCity(BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            changeMaxLineCityIfLineIsLonger(line);
        }
        return maxLengthCity;
    }

    private void changeMaxLineCityIfLineIsLonger(String line) {
        String[] splitLine = line.split(";");
        if (maxLengthCity.length() < splitLine[1].length()) {
            maxLengthCity = splitLine[1];
        }
    }

}
