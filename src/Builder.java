public class Builder extends Person{
    private int work_experience;
    public Builder(String first_name, String last_name, int age) {
        super(first_name, last_name, age);
    }

    public double ComputeSalary(Building building){
        return ((building.getPrice()*(this.work_experience/100))+10000);
    }
}
