package troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (!(name == null || name.isBlank())) {
            moveTrooper(findTrooperByName(name), target);
        }
    }

    public void moveClosestTrooper(Position target) {
        if (troopers != null) {
            moveTrooper(findClosestTrooper(target), target);
        }
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper foundTruper = troopers.get(0);
        double distance = foundTruper.distanceFrom(target);

        for (Trooper findTrooper : troopers) {
            double actualDistance = findTrooper.distanceFrom(target);
            if (actualDistance < distance) {
                distance = actualDistance;
                foundTruper = findTrooper;
            }
        }
        return foundTruper;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        if (!(trooper == null || target == null))
            trooper.changePosition(target);
    }
}

