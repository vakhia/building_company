public final class Foreman extends Employee{
    private int numberOfTeam;

    public void setNumberOfTeam(int numberOfTeam) {
        if(numberOfTeam>0){
            this.numberOfTeam = numberOfTeam;
        } else {
            throw new IllegalArgumentException("Number of team cannot be null!");
        }
    }

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public Foreman() {
    }

    public Foreman(String first_name, String last_name, int age, int salary, int numberOfTeam) {
        super(first_name, last_name, age, salary);
        this.numberOfTeam = numberOfTeam;
    }

    @Override
    public String toString() {
        return "Foreman = " +
                "numberOfTeam=" + numberOfTeam;
    }
}
