package week10d01;

import java.util.List;

public class Hiking {
    double latitude;
    double longitude;
    double height;

    double getPlusElevation(List<Double> heights) {
        if (heights == null) {
            throw new IllegalArgumentException("");
        }
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