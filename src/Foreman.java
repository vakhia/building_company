import Exceptions.InvalidNumberException;
import Interfaces.IForeman;

public final class Foreman extends Employee implements IForeman {
    private int numberOfTeam;

    public Foreman() {
    }

    public Foreman(String firstName, String lastName, int age, int salary, int numberOfTeam) {
        super(firstName, lastName, age, salary);
        this.numberOfTeam = numberOfTeam;
    }

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public void setNumberOfTeam(int numberOfTeam) throws InvalidNumberException {
        if (numberOfTeam > 0) {
            this.numberOfTeam = numberOfTeam;
        } else {
            throw new InvalidNumberException("Number of team cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Foreman = " +
                "numberOfTeam=" + numberOfTeam;
    }


    @Override
    public String Hire() {
        return "Foreman hired 100 workers";
    }
}
