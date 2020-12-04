package methodparam.measuring;

public class Measurement {
    private double[] measurmentResult;

    public Measurement(double[] measurmentResult) {
        this.measurmentResult = measurmentResult;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < measurmentResult.length; i++) {
            if (measurmentResult[i] < upper && measurmentResult[i] > lower) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double result = measurmentResult[0];
        for (int i = 1; i < measurmentResult.length; i++) {
            if (measurmentResult[i] < result) {
                result = measurmentResult[i];
            }
        }
        return result;
    }

    public double maximum() {
        double result = measurmentResult[0];
        for (int i = 1; i < measurmentResult.length; i++) {
            if (measurmentResult[i] > result) {
                result = measurmentResult[i];
            }
        }
        return result;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}
