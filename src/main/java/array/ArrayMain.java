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

        System.out.println("A kettő hatványai tömb elemei: ");
        for (int item : intArray) {
            System.out.println(item);
        }

        System.out.println("Boolean tömb elemei :");
        Boolean[] boolArray = new Boolean[6];
        for (int i = 0; i < boolArray.length; i++) {
            boolArray[i] = i % 2 == 1;
        }

        for (Boolean b : boolArray) {
            System.out.println(b);
        }

//      Keresés int tömbben.

        ArrayHandler arrayHandler = new ArrayHandler();
        int[] ints = {1, 2, 4, 6, 8, 9, 10};
        int findIt = 6;

        System.out.println("Keresés ... ");
        System.out.println("van-e : "+ arrayHandler.contains(ints, findIt));
        System.out.println("idex  : " + arrayHandler.find(ints,findIt));


    }
}
