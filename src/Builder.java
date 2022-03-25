import Interfaces.IBuilder;

public final class Builder extends Employee implements IBuilder {
    private int work_experience;

    public int getWorkExperience() {
        return work_experience;
    }

    public Builder() {
    }

    public void setWorkExperience(int work_experience) {
        if (work_experience > (-1)) {
            this.work_experience = work_experience;
        } else {
            throw new IllegalArgumentException("Work experience cannot be null!");
        }
    }

    public Builder(String first_name, String last_name, int age, int salary, int work_experience) {
        super(first_name, last_name, age, salary);
        this.work_experience = work_experience;
    }

    public double ComputeSalary(Building building) {
        return ((building.getPrice() * (this.work_experience / 100)) + 10000);
    }

    @Override
    public String toString() {
        return "Builder =" +
                "work_experience=" + work_experience;
    }

    @Override
    public String Build() {
        return "Building...";
    }
}
