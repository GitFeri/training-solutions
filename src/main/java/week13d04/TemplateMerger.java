package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    private static final String NAME_PH = "{nev}";
    private static final String YEAR_PH = "{ev}";

    private StringBuilder strBuilder = new StringBuilder();

    public String merge(Path file, List<Employee> employees) {
        String empleesSample = readSampleFromFile(file);
        strBuildFromEmployeesBySample(empleesSample, employees);
        return strBuilder.toString();
    }

    private String readSampleFromFile(Path file) {
        try {
            return Files.readString(file);
        } catch (IOException e) {
            throw new IllegalArgumentException("No file found!");
        }
    }

    private void strBuildFromEmployeesBySample(String employeeSample, List<Employee> employees) {
        for (Employee employee : employees) {
            strBuilder.append(employeeBySample(employeeSample, employee));
            strBuilder.append("\n");
        }
    }

    private String employeeBySample(String sample, Employee employee) {
        String name = employee.getName();
        String yearOfBirthStr = String.valueOf(employee.getYearOfBirth());
        return sample.replace(NAME_PH, name).replace(YEAR_PH, yearOfBirthStr);
    }
}
