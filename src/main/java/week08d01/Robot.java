package week08d01;

public class Robot {
    Position position;

    public Robot() {
        position = new Position(0,0);
    }

    public Position move(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!oneMove(string.charAt(i))) {
                throw new IllegalArgumentException("Not FLBJ");
            }
        }
        return position;
    }

    private boolean oneMove(Character ch) {
        if (ch == 'F') {
            position.incY();
            return true;
        }
        if (ch == 'L') {
            position.decY();
            return true;
        }
        if (ch == 'B') {
            position.decX();
            return true;
        }
        if (ch == 'J') {
            position.incX();
            return true;
        }
        return false;
    }

}
