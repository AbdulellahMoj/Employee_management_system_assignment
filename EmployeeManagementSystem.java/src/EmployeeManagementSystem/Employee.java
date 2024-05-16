// This class is an abstract class that represents an Employee object. 
//It has attributes name, id, salary, state and leaveRecords. 

//Purpose: This class is used to create Employee objects. It has attributes that represent the name, id, salary, state, and leave records of an employee. It also has methods that set the state of the employee, add a leave record, and return the leave records of the employee.
package EmployeeManagementSystem;

import java.util.ArrayList;

public abstract class Employee {
    // attributes
    private String name;
    private int id;
    private double salary;
    private String state = " ";
    private ArrayList<Leave> leaveRecords = new ArrayList<Leave>();

    // constructor
    // it takes three parameters name, id, and salary
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.state = "Working";

    }

    // abstract method
    // calculateBonus method
    public abstract double calculateBonus();

    // toString method
    // it returns the name, id, salary, and state of the employee
    @Override
    public String toString() {
        return "Name: " + name + " ID: " + id + " Salary: " + salary + " State: " + state;
    }
    // methods

    // setStateOnLeave method
    // it will set the state of the employee to "On Leave"

    public void setStateOnLeave() {
        this.state = "On Leave";
    }

    // setStateWorking method
    // it will set the state of the employee to "Working"
    public void setStateWorking() {
        this.state = "Working";

    }

    // addLeaveRecord method
    // it will add a new Leave object to the leaveRecords ArrayList

    public void addLeaveRecord(Leave leave) {
        leaveRecords.add(leave);
    }

    // getLeaveRecords method
    // it will return the leaveRecords ArrayList
    public ArrayList getLeaveRecords() {
        return leaveRecords;
    }

    // getter methods

    // getName method
    public String getName() {
        return name;
    }

    // getId method
    public int getId() {
        return id;
    }

    // getState method
    public String getState() {
        return state;
    }

    // getSalary method
    public double getSalary() {
        return salary;
    }

}
