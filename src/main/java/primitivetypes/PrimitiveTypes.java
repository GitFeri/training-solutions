package primitivetypes;

public class PrimitiveTypes {
    private final int NUMBER_OF_BITS = 32;

    public String toBinaryString(int n) {
        String binaryStr = "";
        int num = n;

        for (int i = 0; i < NUMBER_OF_BITS; i++) {
            if ((num % 2) == 0) {
                binaryStr = '0' + binaryStr;
            } else {
                binaryStr = '1' + binaryStr;
            }
            num = num / 2;
        }
        return binaryStr;
    }

    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        final int NUMBER_TO_STRING = 5;
        System.out.println(primitiveTypes.toBinaryString(NUMBER_TO_STRING));
        System.out.println(Integer.toBinaryString(NUMBER_TO_STRING));
    }
}
