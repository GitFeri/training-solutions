package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

//    private final String FILE_PATH = "J://training//files//";

    private final String FILE_PATH = "";

    public static void main(String[] args) {

//       for (int j = 0; j < 100; j++)
//           new FileSum().writeToFile(j, j * 3);

        FileSum fileSum = new FileSum();
        System.out.println(fileSum.sumNumbers());
    }

    public int sumNumbers() {
        FileSum fileSum = new FileSum();
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += fileSum.readIntFromFile(i);
        }
        return sum;
    }

    private int readIntFromFile(int i) {
        if (i < 0 || i > 99) {
            return 0;
        }

        Path path = Path.of(FILE_PATH + "number" + intToString2(i) + ".txt");

        if (!Files.isRegularFile(path)) {
            return 0;
        }

        try {
            return Integer.parseInt(Files.readString(path));
        } catch (IOException e) {
            return 0;
        }
    }

    private void writeToFile(int i, int num) {

        Path path = Path.of(FILE_PATH + "number" + intToString2(i) + ".txt");

        try {
            Files.writeString(path, Integer.toString(num));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String intToString2(int i) {

        if (i < 10) {
            return "0" + i;
        } else {
            return Integer.toString(i);
        }
    }
}
