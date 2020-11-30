package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        for (int i = 155; i < 167; i++) {
            System.out.println(i + " páros-e : " + operators.isEven(i));
        }
    }
}
