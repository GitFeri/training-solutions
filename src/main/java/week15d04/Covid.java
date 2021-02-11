package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Covid {

    final int MAX_SIZE = 3;
    final String COUNTRIES = "Hungary";
    private List<Data> datas = new ArrayList<>();

    public List<String> maxCases(Path path) {
        List<String> result = new ArrayList<>();
        fileRead(path);
        for (Data data : datas) {
            result.add(data.getYear_week());
        }
        return result;
    }

    private void fileRead(Path path) {
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
                insertIntoTheList(0, readFromLine(line));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File read error");
        }
    }

    private Data readFromLine(String line) {
        String[] splitedLine = line.split(",");
        return new Data(
                splitedLine[1],
                Integer.parseInt(splitedLine[2]),
                splitedLine[4]);
    }

    private void insertIntoTheList(int position, Data data) {
        if (position >= MAX_SIZE || !data.getCountries().equals(COUNTRIES)) {
            return;
        }

        if (thePositionIsFree(position) || theDataElementLessThanAt(position, data)) {
            datas.add(position, data);
        } else {
            insertIntoTheList(++position, data);
        }

        if (datas.size() > MAX_SIZE) {
            datas.remove(MAX_SIZE);
        }
    }

    private Boolean thePositionIsFree(int position) {
        return datas.size() <= position;
    }

    private Boolean theDataElementLessThanAt(int position, Data data) {
        return datas.get(position).getCases_weekly() < data.getCases_weekly();
    }
}
