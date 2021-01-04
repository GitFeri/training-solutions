package week10d01;

public class Hiking {
    double latitude;
    double longitude;
    double height;

    double getPlusElevation(double... heights) {
        double result = 0;
        boolean first = true;
        double prev = 0;
        for (double height : heights) {
            if (first) {
                first = false;
            } else {
                if (height > prev) {
                    result += height - prev;
                }
            }
            prev = height;
        }
        return result;
    }
}