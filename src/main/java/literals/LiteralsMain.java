package literals;

import java.util.Arrays;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("1" + 2);
        System.out.println("" + 1 + 2);
        System.out.println("1" + "2");


        double quotient = 3 / 4;        // egész osztás, eredménye 0
        double quotient1 = 3d / 4;
        double quotient2 = (double) 3 / 4;
        double quotient3 = 3 / 4.0;
        System.out.println(quotient);
        System.out.println(quotient1);
        System.out.println(quotient2);
        System.out.println(quotient3);

        long big = 3_244_444_444L;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        String word = new String("title").toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

    }
}
