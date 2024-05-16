//Designer class that extends Employee class and implements the calculateBonus method and toString method
//Designer class has a constructor that takes three parameters name, id, and salary
//Designer class has a method calculateBonus that returns the bonus of the designer
//The bonus of the designer is 10% of the salary

//Purpose: This class is used to create Designer objects. It has a constructor that takes in a name, an id, and a salary. It also has a method that returns the bonus of the designer.
package EmployeeManagementSystem;

public class Designer extends Employee {

    // constructor
    Designer(String name, int id, double salary) {
        super(name, id, salary);
    }

    // methods

    // calculateBonus method
    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

}
