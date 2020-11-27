package debug.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("John Doe", 1980),
                new Employee("Jack Doe", 1990)));


        Company company = new Company(employees);

        company.addEmployee(new Employee("Jane Doe",2000));

        System.out.println(company.listEmployeeNames());
        Employee find = company.findEmployeeByName("John Doe");
        System.out.println(find.getName()+ " : " + find.getYearOfBirth() );
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeByName(String employeeName) {
        for (Employee employ : employees) {
            if (employ.getName().equals(employeeName)) {
                return employ;
            }
        }
        return null;
    }

    public List<String> listEmployeeNames() {
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : employees) {
            employeeNames.add(employee.getName());
        }
        return employeeNames;
    }
}
