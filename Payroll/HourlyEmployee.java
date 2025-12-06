package Payroll;

public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, String employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateWeeklyPay() {
        return this.hourlyRate * this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }
}
