package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(starByLine(line) + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read the file.");
        }
        return stringBuilder.toString();
    }

    private String starByLine(String line) {
        int num = Integer.parseInt(line);
        char[] result = new char[num];
        Arrays.fill(result, '*');
        return String.valueOf(result);
    }

}
