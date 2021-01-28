package week13d04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {

    TemplateMerger templateMerger = new TemplateMerger();
    List<Employee> employees = new ArrayList<>();

    @BeforeEach
    void SetUp() {
        employees.add(new Employee("John Doe", 1980));
        employees.add(new Employee("Jack Doe", 1990));
    }

    @Test
    void fileNoTest() {
        Path noFile = Path.of("akarmi.txt");
        assertThrows(IllegalArgumentException.class, () -> templateMerger.merge(noFile, employees));
    }

    @Test
    void mergeTest() {
        Path file = Path.of("sample.txt");
        assertEquals(
                """
                        Az alkalmazott neve: John Doe, születési éve: 1980
                        Az alkalmazott neve: Jack Doe, születési éve: 1990
                        """,
                templateMerger.merge(file, employees));
    }
}