import Interfaces.IBuilder;

public final class Builder extends Employee implements IBuilder {
    private int workExperience;

    public Builder() {
    }


    public Builder(String firstName, String lastName, int age, int salary, int workExperience) {
        super(firstName, lastName, age, salary);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        if (workExperience > (-1)) {
            this.workExperience = workExperience;
        } else {
            throw new IllegalArgumentException("Work experience cannot be null!");
        }
    }

    public double ComputeSalary(Building building) {
        return ((building.getPrice() * (this.workExperience / 100)) + 10000);
    }

    @Override
    public String toString() {
        return "Builder =" +
                "workExperience=" + workExperience;
    }

    @Override
    public String Build() {
        return "Building...";
    }
}
