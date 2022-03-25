import Interfaces.IEmployee;

public class Employee extends Person implements IEmployee {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>0){
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be null!");
        }
    }


    public Employee() {}

    public Employee(String first_name, String last_name, int age, int salary) {
        super(first_name, last_name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee = " +
                "salary=" + salary;
    }

    public void Work() {
        //:TODO Realise Work method;
    }
}
