//Leave class to store the details of the leave taken by the employee
//Attributes of the Leave class employee, startDate, and daysOfLeave

// Purpose: This class is used to create Leave objects. It has a constructor that takes in an Employee object, a LocalDate object, and an integer. It also has a method that returns a string with the start date and the number of days of leave.
package EmployeeManagementSystem;

import java.time.LocalDate;

public class Leave {
    private Employee employee;
    private LocalDate startDate;
    private int daysOfLeave;

    // constructor
    // it takes three parameters employee, startDate, and daysOfLeave
    public Leave(Employee employee, LocalDate startDate, int daysOfLeave) {
        this.employee = employee;
        this.startDate = startDate;
        this.daysOfLeave = daysOfLeave;
    }
    // methods

    // displayLeaveDetails method
    // it returns the startDate and daysOfLeave of the leave
    public String displayLeaveDetails() {
        return (startDate + "   " + daysOfLeave);

    }
}
