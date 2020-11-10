package week02;

import java.util.ArrayList;
import java.util.List;

public class Position {
    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    String name;
    int bonus;

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {
        List<Position> position = new ArrayList<>();

        position.add(new Position("John Doe", 100_000));
        position.add(new Position("Joe Doe", 200_000));




        for (Position p : position) {
            if (p.bonus > 150_000) {
                System.out.println(p);
            }

        }



    }

}
