package typeconversion.dataloss;

public class DataLoss {
    public void dataLoss(long start,int count) {
        int i;
        long l1;
        float f;
        long l2;

        i = 0;
        l1 = start;
        while (true) {
            f = l1;
            l2 = (long) f;
            if (l1 != l2) {
                System.out.println("konvertális hiba: " + l1 + " különbség : " + Math.abs(l1 - l2) + " bin : " + Long.toBinaryString(l1));
                i++;
                if (i == count) {
                    return;
                }
            }
            l1++;
        }
    }
}
