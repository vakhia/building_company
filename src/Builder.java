public class Builder extends Person{
    private int work_experience;

    public int getWork_experience() {
        return work_experience;
    }

    public void setWork_experience(int work_experience) {
        if(work_experience>(-1)){
            this.work_experience = work_experience;
        } else {
            throw new IllegalArgumentException("Work experience cannot be null!");
        }
    }

    public Builder(String first_name,String last_name,int age){
        super(first_name, last_name, age);
    }

    public Builder(String first_name, String last_name, int age, int work_experience) {
        super(first_name, last_name, age);
        this.work_experience = work_experience;
    }

    public double ComputeSalary(Building building){
        return ((building.getPrice()*(this.work_experience/100))+10000);
    }

    @Override
    public String toString() {
        return "Builder =" +
                "work_experience=" + work_experience;
                }
}
