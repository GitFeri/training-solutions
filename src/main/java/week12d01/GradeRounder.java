package week12d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {

        int[] result = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 40) {
                result[i] = roundToFive(grades[i]);
            } else {
                result[i] = grades[i];
            }
        }

        return result;
    }

    private int roundToFive(int i) {
        int mod = i % 5;
        if (mod <= 2) {
            i -= mod;
        } else {
            i += 5 - mod;
        }
        return i;
    }
}
