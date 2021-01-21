package week04d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null) {
            throw new IllegalArgumentException("Invalid Name: null");
        }
        if ("".equals(fullName)) {
            throw new IllegalArgumentException("Invalid Name: <üres>");
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFirstName(String firstName) {
        String lastName = fullName.substring(0,fullName.indexOf(" "));
        fullName = lastName + " " + firstName;
    }

    public static void main(String[] args) {
        NameChanger nameChanger = new NameChanger("Kiss Ferenc");
        nameChanger.changeFirstName("Péter");
        System.out.println(nameChanger.fullName);
    }

}

