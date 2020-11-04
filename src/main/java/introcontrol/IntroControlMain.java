package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(2));
        System.out.println(introControl.substractTenIfGreaterThanTen(5));
        System.out.println(introControl.substractTenIfGreaterThanTen(10));
        System.out.println(introControl.substractTenIfGreaterThanTen(11));
        System.out.println(introControl.substractTenIfGreaterThanTen(20));

    }
}
