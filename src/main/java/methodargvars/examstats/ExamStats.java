package methodargvars.examstats;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        int numberOfTopGrades = 0;
        int limit = (int) (limitInPercent * maxPoints / 100.0);
        for (int result : results) {
            if (result > limit) {
                numberOfTopGrades++;
            }
        }
        return numberOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        int limit = (int) (limitInPercent * maxPoints / 100.0);
        for (int result : results) {
            if (result < limit) {
                return true;
            }
        }
        return false;
    }
}
