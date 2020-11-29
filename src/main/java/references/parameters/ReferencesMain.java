package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person firstPerson;
        Person secondPerson;

        firstPerson = new Person("Joh Doe", 30);
        secondPerson = firstPerson;

        secondPerson.setName("Jane Doe");

        System.out.println(firstPerson.getName() + " " + firstPerson.getAge());
        System.out.println(secondPerson.getName() + " " + secondPerson.getAge());

        int i1;
        int i2;

        i1 = 24;
        i2 = i1;
        i2++;
        System.out.println(i1 + " " + i2);

        secondPerson = new Person("Joe Doe", 50);
        System.out.println(firstPerson.getName() + " " + firstPerson.getAge());
        System.out.println(secondPerson.getName() + " " + secondPerson.getAge());

    }
}
