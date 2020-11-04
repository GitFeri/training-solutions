package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(2));
        System.out.println(introControl.substractTenIfGreaterThanTen(5));
        System.out.println(introControl.substractTenIfGreaterThanTen(10));
        System.out.println(introControl.substractTenIfGreaterThanTen(11));
        System.out.println(introControl.substractTenIfGreaterThanTen(20));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(5));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("joe"));

        System.out.println("jutalék : " + introControl.calculateBonus(999999));
        System.out.println("jutalék : " + introControl.calculateBonus(1000000));
        System.out.println("jutalék : " + introControl.calculateBonus(1000001));
        System.out.println("jutalék : " + introControl.calculateBonus(1000100));


        System.out.println("mérőóra :" + introControl.calculateConsumption(900,1111));
        System.out.println("mérőóra :" + introControl.calculateConsumption(9000,1111));

        System.out.println("számsor: ");
        introControl.printNumbers(8);

        System.out.println("számok között: ");
        introControl.printNumbersBetween(25,28);

        System.out.println("Számsor 2 ");
        introControl.printNumbersBetweenAnyDirection(5,9);
        introControl.printNumbersBetweenAnyDirection(9,5);

        System.out.println("Páratlan: ");
        introControl.printOddNumbers(7);
    }
    }
