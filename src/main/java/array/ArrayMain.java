package array;

public class ArrayMain {
    private static Object Boolean;

    public static void main(String[] args) {
        String[] dayOfWeekNames = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "casárnap"};

        System.out.println("A második elem : " + dayOfWeekNames[1]);
        System.out.println("A tömb hossza  : " + dayOfWeekNames.length);

        int[] intArray = new int[5];

        for (int i = 0; i < 5; i++) {
            intArray[i] = (int) Math.pow(2, i);
        }

        for (int item : intArray) {
            System.out.println(item);
        }

        Boolean[] boolArray = new Boolean[6];

        for (int i = 0; i < boolArray.length; i++) {
            boolArray[i] = i % 2 == 1;
        }

        for (Boolean b : boolArray) {
            System.out.println(b);
        }
    }
}
