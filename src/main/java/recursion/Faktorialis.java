package recursion;

public class Faktorialis {

    public long getFacrorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getFacrorial(--n);
        }

    }
}
