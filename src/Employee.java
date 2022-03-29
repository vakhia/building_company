import Exceptions.InvalidNumberException;
import Interfaces.IEmployee;

public class Employee extends Person implements IEmployee {
    private int salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws InvalidNumberException {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new InvalidNumberException("Salary cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Employee = " +
                "salary=" + salary;
    }

    @Override
    public String Work() {
        return "Working...";
    }
}
