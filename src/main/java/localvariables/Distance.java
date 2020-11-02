package localvariables;

public class Distance {
    private double distanceInKm;
    private boolean exact;

    public Distance(double distanceInKm, boolean exact) {
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean isExact() {
        return exact;
    }

    public static void main(String[] args) {
        Distance distance = new Distance(123.23,true);
        System.out.println("A távolság pontos : "+distance.isExact());

        int i = (int) distance.getDistanceInKm();

    }
}
