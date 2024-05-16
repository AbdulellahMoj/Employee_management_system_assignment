// Abdulellah Mojalled
// 2339058
//section c11
// Assignment 2 CPCS203

package EmployeeManagementSystem;
import java.time.LocalDate;

public class Manager extends Employee implements Approver{

//constructor 
public Manager(String name , int id, double salary){
    super(name, id, salary);

}
    //methods
        //calculateBonus method
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }
        //approveLeave method
            //it will create a new Leave object and add it to the employee's leave record
    @Override
    public void approveLeave(Employee employee, LocalDate date, int daysOfLeave){
        Leave leave = new Leave(employee, date, daysOfLeave);
        employee.addLeaveRecord(leave); 
        employee.setStateOnLeave();
    }
        //markEmployeeAsWorking method
    @Override
    public void markEmployeeAsWorking(Employee employee){
        employee.setStateWorking();
    }


}
