package week10d05;

public class Calculator {

    private static final int MAX_SUM_ELEMENTS = 4;
    private int[] ownArr;

    public int finMinSum(int[] arr) {

        if (arr == null || arr.length < MAX_SUM_ELEMENTS) {
            throw new IllegalArgumentException();
        }

        ownArr = arr;

        for (int i = 0; i < MAX_SUM_ELEMENTS; i++) {
            for (int j = i; j < ownArr.length; j++) {
                if (ownArr[j] < ownArr[i]) {
                    changeElementsInArray(i, j);
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < MAX_SUM_ELEMENTS; i++) {
            sum += ownArr[i];
        }
        return sum;
    }

    private void changeElementsInArray(int i, int j) {
        int temp;
        temp = ownArr[i];
        ownArr[i] = ownArr[j];
        ownArr[j] = temp;
    }
}
