package objectclass;

public class Beer {

    private final String name;
    private final int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            return toString().equals(obj.toString());
        }
    }
}

