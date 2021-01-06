package exam02;

public class ArraySelector {
    public String selectEvens(int[] ints) {
        if (ints.length == 0) {
            return "";
        }

        String result = "[";
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0) {
                result += ints[i] + ", ";
            }
        }
        return result.substring(0,result.length() - 2) + "]";
    }
}

