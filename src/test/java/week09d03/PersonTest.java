package week09d03;

import jdk.jshell.Snippet;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PersonTest {

    @Test
    public void testPerson() {

        for (int i = 0; i <= 30; i++) {
            List<Person> people = List.of(new Person("John Doe", i));
            SantaClaus santaClaus = new SantaClaus(people);
            santaClaus.getThroughChimneys();
            System.out.println(people);
        }

    }


}
