package statements;

public class InvestmentMain {
    public static void main(String[] args) {
        Investment investment = new Investment(100000,8);

        System.out.println("Tőke : " + investment.getFund());
        System.out.println("Hozam 50 napra :" + investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80) );
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90) );


    }
}
