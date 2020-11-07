package arrayofarrays;

public class ArrayOfArraysMain {
    int[][] multiplicationTable(int size) {
        int[][] ints = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ints[i][j] = (i + 1) * (j + 1);
            }
        }
        return ints;
    }


    public static void main(String[] args) {
        int size = 4;
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();
        int[][] ints = arrayOfArraysMain.multiplicationTable(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
