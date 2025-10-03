package com.tnsif.Assignment1;
import com.tnsif.Assignment1.employees.Developer;
import com.tnsif.Assignment1.employees.Manager;
import com.tnsif.Assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
        Manager mgr = new Manager("Afsar", 101, 75000, "Sales");
        Developer dev = new Developer("jawed", 102, 60000, "Java");

        // Use utilities
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        // Give raises
        EmployeeUtilities.giveRaise(mgr, 10);
        EmployeeUtilities.giveRaise(dev, 15);
    }

}
