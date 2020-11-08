package arrayofarrays;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> color = new ArrayList<>();

    public void addLast(String color) {
        this.color.add(color);
    }

    public void addFirst(String color) {
        this.color.add(0, color);
    }

    public void removeFirst() {
        color.remove(0);
    }

    public void removeLast() {
        color.remove(color.size() - 1);
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addLast("Piros");
        capsules.addLast("Fehér");
        capsules.addLast("Zöld ");
        capsules.addLast("Kék  ");
        capsules.addFirst("Sárga");
        capsules.removeLast();
        capsules.removeFirst();

        System.out.println(capsules.color);
    }
}
