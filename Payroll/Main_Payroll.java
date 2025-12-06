package Payroll;

import java.util.ArrayList;
import java.util.List;

public class Main_Payroll {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new HourlyEmployee("Llŷr Williams", "LW22", 23.00, 35));
        employees.add(new HourlyEmployee("Attila Halife", "AH96", 30.00, 35));
        employees.add(new HourlyEmployee("Paul Davidson", "PD557", 19.00, 57));

        employees.add(new Manager("Septimus the III", "ST3197", 78.93, 15));
        employees.add(new Manager("Elizabeth Jenson", "EJ443", 90.31, 45));

        System.out.println("--- Weekly Payroll Report ---");

        for (Employee emp : employees) {
            System.out.println(emp.toString());
            System.out.printf("Weekly Pay: $%.2f\n", emp.calculateWeeklyPay());
            System.out.println("-----------------------------");

        }
    }
}
