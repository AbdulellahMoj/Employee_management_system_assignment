//EmployeManagementSystem class "NOT MAIN CLASS"
//This class is used to manage the employees in the company. 
//It has an ArrayList of Employee objects and provides methods to add and remove employees, approve leave, mark employees as working, print all employees, and print leave records of an employee. 
//It also has a private method to find an employee by id.

//Purpose: This class is used to manage the employees in the company. It has an ArrayList of Employee objects and provides methods to add and remove employees, approve leave, mark employees as working, print all employees, and print leave records of an employee. It also has a private method to find an employee by id.
package EmployeeManagementSystem;

//imoporting the required
import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeManagementSystem {
  // Attributes
  // ArrayList of Employee objects
  ArrayList<Employee> employees = new ArrayList<Employee>();;

  // constructors
  // Unused constructors "EmployeeManagementSystem() and
  // EmployeeManagementSystem(String name, int id, double salary)" are defined for
  // more clarity.
  public EmployeeManagementSystem() {
  }

  public EmployeeManagementSystem(String name, int id, double salary) {
  }

  // methods

  // ----------------------------------------------
  // addEmployee method
  // it takes an Employee object as a parameter and adds the employee to the
  // employees list. It returns a string message indicating whether the employee
  // was added successfully or not.
  public String addEmployee(Employee employee) {
    employees.add(employee);

    if (employee instanceof Manager) {
      return "Manager " + employee.getName().trim() + " added. ";
    } else if (employee instanceof Designer) {
      return "Designer " + employee.getName().trim() + " added. ";
    } else if (employee instanceof Developer) {
      return "Developer " + employee.getName().trim() + " added. ";
    } else {
      return "not an Employee ";
    }

  }

  // ----------------------------------------------
  // removeEmployee method
  // it takes an integer id as a parameter and removes the employee with the given
  // id from the employees list. It returns a string message indicating whether
  // the employee was removed successfully or not.
  public String removeEmployee(int id) {
    Employee employee = findEmployeeById(id);
    if (employee != null) {
      employees.remove(employee);
      return "Employee removed successfully.";
    } else {
      return "Employee with ID " + id + " not found.";
    }
  }

  // ----------------------------------------------
  // printAllEmployees method
  // it returns a string containing the details of all the employees in the
  // employees list.
  public String printAllEmployees() {
    String allString = "Name            ID    Salary     Bonus";

    for (Employee employee : employees) {
      allString += String.format("\n%-16s%-6d%-11.2f%7.2f", employee.getName().trim(), employee.getId(),
          employee.getSalary(), employee.calculateBonus());

    }
    return allString;

  }

  // ----------------------------------------------
  // approveLeave method
  // it takes four parameters: managerId, employeeId, date, and daysOfLeave. It
  // approves the leave for the employee with the given employeeId if the manager
  // with the given managerId is an instance of Approver and the employee is not
  // already on leave. It returns a string message indicating whether the leave
  // was approved or not.

  public String approveLeave(int managerId, int employeeId, LocalDate date, int daysOfLeave) {
    Employee employee = findEmployeeById(employeeId);
    Employee manager = findEmployeeById(managerId);
    // checking if the employee and manager are not null
    if (employee != null && manager != null) {
      // checking if the manager is an instance of Approver

      if (manager instanceof Approver) {
        // checking if the employee is not already on leave

        if (employee.getState().equals("Working")) {
          // approving the leave
          ((Manager) manager).approveLeave(employee, date, daysOfLeave);
          return "Leave approved for " + employee.getName().trim() + ".";

        } else {
          return "Cannot approve leave for " + employee.getName().trim() + " as they are already on leave.";

        }
      }
    } else {
      return "Leave approval failed. Either manager ID is incorrect or employee ID does not exist.";
    }
    return "Leave approval failed. Either manager ID is incorrect or employee ID does not exist.";

  }

  // ----------------------------------------------
  // markEmployeeAsWorking method
  // it takes two parameters: managerId and employeeId. It marks the employee with
  // the given employeeId as working if the manager with the given managerId is an
  // instance of Approver. It returns a string message indicating whether the
  // employee was marked as working or not.
  public String markEmployeeAsWorking(int managerId, int employeeId) {
    Employee employee = findEmployeeById(employeeId);
    Employee manager = findEmployeeById(managerId);
    // checking if the employee and manager are not null
    if (employee != null && manager != null) {
      // checking if the manager is an instance of Approver
      if (manager instanceof Approver) {
        // marking the employee as working
        ((Approver) manager).markEmployeeAsWorking(employee);
        return "Employee " + employee.getName().trim() + " is now marked as working. ";

      } else {
        return "Employee " + employee.getName() + " could not be marked as working. ";

      }

    } else {
      return "Marking employee as working failed. Either manager ID is incorrect or employee ID does not exist.";
    }

  }

  // ----------------------------------------------
  // printLeaveRecords method
  // it takes an integer id as a parameter and returns a string containing the
  // leave records of the employee with the given id if it exists in the employees
  // list. Otherwise, it returns a message indicating that the employee does not
  // exist.
  public String printEmployeeLeaveRecords(int employeeId) {
    Employee employee = findEmployeeById(employeeId);
    // checking if the employee is not null
    if (employee != null) {
      // creating a string with the leave records of the employee
      String leaveOutput = "Leave Records for " + employee.getName().trim() + ":\n";
      leaveOutput += "Start Date   Days of Leave\n";
      // getting the leave records of the employee
      ArrayList<Leave> leaveArrayList = employee.getLeaveRecords();
      // displaying the leave records

      for (Leave leave : leaveArrayList) {
        leaveOutput += leave.displayLeaveDetails() + "\n";
      }
      return leaveOutput;
    } else {
      return "Employee with ID " + employeeId + " not found.";
    }
  }

  // ----------------------------------------------
  // findEmployeeById method
  // it takes an integer id as a parameter and returns the employee with the given
  // id if it exists in the employees list. Otherwise, it returns null.
  private Employee findEmployeeById(int id) {
    // iterating through the employees list
    // to find the employee with the given id
    for (Employee employee : employees) {
      if (employee.getId() == id) {
        return employee;
      }
    }
    return null;
  }

}
