package com.tnsif.Assignment1.utilities;
import com.tnsif.Assignment1.employees.Employee;

public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    /** Give a salary raise */
    public static void giveRaise(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " got a raise! New Salary: " + newSalary);
    }
}
