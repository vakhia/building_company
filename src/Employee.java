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

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be null!");
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
