public class Employee extends Person{
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

    public Employee(int salary) {

    }

    public Employee(String first_name, String last_name, int age, int salary) {
        super(first_name, last_name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee = " +
                "salary=" + salary;
    }
}
