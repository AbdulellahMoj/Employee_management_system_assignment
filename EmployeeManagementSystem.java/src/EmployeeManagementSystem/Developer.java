//Developer class that extends Employee class and implements the calculateBonus method and toString method
//Developer class has a constructor that takes three parameters name, id, and salary
//Developer class has a method calculateBonus that returns the bonus of the developer
//The bonus of the developer is 12% of the salary

//Purpose: This class is used to create Developer objects. It has a constructor that takes in a name, an id, and a salary. It also has a method that returns the bonus of the developer.
package EmployeeManagementSystem;

public class Developer extends Employee {

    // constructor
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    // methods

    // calculateBonus method
    @Override
    public double calculateBonus() {
        return getSalary() * 0.12;
    }

    // toString method
    @Override
    public String toString() {
        return "developer : " + toString();

    }
}