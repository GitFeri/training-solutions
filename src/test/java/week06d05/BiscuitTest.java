package week06d05;

public class BiscuitTest {
    public static void main(String[] args) {
        Biscuit biscuit = Biscuit.of(BiscuitType.COCONUT,20);

        System.out.println(biscuit.getType() + " " + biscuit.getGramAmount());
    }
}
