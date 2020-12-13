package introinheritance.employee;

class Employee extends Person {

    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        salary += Math.round(getSalary() * percent / 100);
    }
}
