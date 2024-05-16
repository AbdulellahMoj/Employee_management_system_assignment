//Approver interface
//This interface has two methods approveLeave and markEmployeeAsWorking
//approveLeave method is used to approve the leave of an employee
//markEmployeeAsWorking method is used to mark the employee as working

//Purpose: This interface is used to create an Approver object. It has two methods that are used to approve the leave of an employee and mark the employee as working.
package EmployeeManagementSystem;

import java.time.LocalDate;

public interface Approver {
    // methods

    // approveLeave method
    public void approveLeave(Employee employee, LocalDate Date, int daysOfLeave);

    // rejectLeave method
    public void markEmployeeAsWorking(Employee employee);

}
