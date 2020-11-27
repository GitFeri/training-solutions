package finalmodifier;

public class Gentleman {
    private static final String MESSAGE_PREFIX = "Good morning";

    public String sayHello(String name) {
        return MESSAGE_PREFIX + " " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(new Gentleman().sayHello("John Doe"));
    }
}
