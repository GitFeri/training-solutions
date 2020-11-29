package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe",2018,200000);
        employee.raiseSalary(50000);
        System.out.println(employee);
    }
}
