package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Trainers {
    List<TrainerPost> trainerPosts = new ArrayList<>();

    public static void main(String[] args) {
        Trainers trainers = new Trainers();
        trainers.readFile();
        System.out.println(trainers.numberOfHoursByName("Albatrosz Aladin"));
    }

    public void readFile() {

        int lineNum = 1;
        String line = "";
        String name = "";
        String subject = "";
        String classType = "";
        int sumOfClass = 0;

        Path path = Path.of("src", "main", "resources", "week13d03", "beosztas.txt");

        try (BufferedReader br = Files.newBufferedReader(path)) {

            while ((line = br.readLine()) != null) {
                if (lineNum == 1) {
                    name = line;
                }
                if (lineNum == 2) {
                    subject = line;
                }
                if (lineNum == 3) {
                    subject = line;
                }
                if (lineNum == 4) {
                    sumOfClass = Integer.parseInt(line);
                }
                lineNum++;
                if (lineNum == 5) {
                    lineNum = 1;
                    trainerPosts.add(new TrainerPost(name, subject, classType, sumOfClass));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int numberOfHoursByName(String name) {
        int result = 0;
        for (TrainerPost post : trainerPosts) {
            if (post.getName().equals(name)) {
                result += post.getSumOfClass();
            }
        }
        return result;
    }
}
