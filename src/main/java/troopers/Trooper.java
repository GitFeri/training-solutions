package troopers;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Position must not be null.");
        }
        position = new Position(target.getPosX(), target.getPosY());
    }

    public double distanceFrom(Position target) {
        return position.distanceFrom(target);
    }
}

