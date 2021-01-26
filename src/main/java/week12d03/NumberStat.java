package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> sortedNumbers;

    public static void main(String[] args) {
        NumberStat numberStat = new NumberStat();
        numberStat.readFromFile("J://training//files//numlist.txt");
        System.out.println("A legkisebb egyedi szám : " + numberStat.findSmallestUnique());
    }

    public int findSmallestUnique() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Empty list");
        }

        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        if (sortedNumbers.size() == 2) {
            if (sortedNumbers.get(0) < sortedNumbers.get(1)) {
                return sortedNumbers.get(0);
            } else {
                throw new IllegalStateException("Rossz lista.");
            }
        }

        return minNumberOfList();
    }

    public int minNumberOfList() {
        for (int i = 1; i < sortedNumbers.size() - 1; i++) {
            if (sortedNumbers.get(i) != sortedNumbers.get(i - 1) &&
                    sortedNumbers.get(i) != sortedNumbers.get(i + 1)) {
              return sortedNumbers.get(i);
            }
        }

        if (sortedNumbers.get(sortedNumbers.size()-1) != sortedNumbers.get(sortedNumbers.size()-2)){
            return sortedNumbers.get(sortedNumbers.size()-1);
        }

        throw new IllegalStateException("Rossz lista.");
    }

    public void readListFrom(String fileName) {
        Path path = Path.of(fileName);

        try {
            String s = Files.readString(path);
            Integer.parseInt(s);
        } catch (IOException e) {
            System.out.println("Hiba");
        }

    }

    public void readFromFile(String fileName) {
        Path path = Path.of(fileName);

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                addLine(temp);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong", ioe);
        }

    }

    private void addLine(String[] temp) {
        for (String s : temp) {
            numbers.add(Integer.parseInt(s));
        }
    }


}


