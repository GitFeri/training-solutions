package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public int getBonus() {
        return bonus;
    }

    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();

        positions.add(new Position("employe", 100_000));
        positions.add(new Position("maneger", 200_000));


        for (Position position : positions) {
            if (position.getBonus() > 150_000) {
                System.out.println(position);
            }

        }


    }

}
