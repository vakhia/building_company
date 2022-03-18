public class Foreman extends Person{
    private int numberOfTeam;

    private void setNumberOfTeam(int numberOfTeam) {
        if(numberOfTeam>0){
            this.numberOfTeam = numberOfTeam;
        } else {
            throw new IllegalArgumentException("Number of team cannot be null!");
        }
    }

    public Foreman(String first_name, String last_name, int age, int numberOfTeam) {
        super(first_name, last_name, age);
        this.setNumberOfTeam(numberOfTeam);
    }
}
