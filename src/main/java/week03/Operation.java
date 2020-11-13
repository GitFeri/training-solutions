package week03;

public class Operation {
    int leftOperand;
    int rightOperand;

    public Operation(String input) {
        int posOfPlus = input.indexOf("+");
        leftOperand = Integer.parseInt(input.substring(0,posOfPlus).trim());
        rightOperand = Integer.parseInt(input.substring(posOfPlus+1).trim());
    }

    public int GetResult() {
        return leftOperand + rightOperand;
    }
}
