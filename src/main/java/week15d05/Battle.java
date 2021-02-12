package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Battle {

    private Map<String, Integer> militantes = new HashMap<>();

    public String readMaxBattleMilitante(Path path) {
        fileReadToMap(path);
        return searchMaxFromMap();
    }

    private String searchMaxFromMap() {
        String maxName = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> militante : militantes.entrySet()) {
            if (militante.getValue() > maxValue) {
                maxValue = militante.getValue();
                maxName = militante.getKey();
            }
        }
        return maxName;
    }

    private void fileReadToMap(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            processFile(br);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't find file.", ioe);
        }
    }

    private void processFile(BufferedReader br) {
        try {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                readFromLine(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File read error");
        }
    }

    private void readFromLine(String line) {
        String field[] = line.split(",");
        if (isBattle(field)) {
            for (int i = 5; i <= 12; i++) {
                addToMilitantes(field[i]);
            }
        }
    }

    private Boolean isBattle(String field[]) {
        return true;
    }

    private void addToMilitantes(String field) {

        if (!"".equals(field)) {
            if (!militantes.containsKey(field)) {
                militantes.put(field, 1);
            } else {
                int value = militantes.get(field);
                militantes.replace(field, ++value);
            }
        }
    }
}
