package arrays;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());

        for (int i = 0; i < 7; i++) {
            System.out.println(arraysMain.daysOfWeek().get(i));

        }
    }

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    List<String> daysOfWeek() {
        return Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütürtök", "Péntek", "Szombat", "Vasárnap");
    }
}
