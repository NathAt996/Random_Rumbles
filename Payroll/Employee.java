package Payroll;

public abstract class Employee {

    private String name;
    private String employeeId;

    public Employee (String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateWeeklyPay();
    //annual salary / 52 weeks

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (ID: " + employeeId + ")";
    }
}

