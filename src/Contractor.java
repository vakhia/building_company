public class Contractor extends Person{
    private boolean seal_stamp;

    public boolean isSeal_stamp() {
        return seal_stamp;
    }

    public Contractor(String first_name, String last_name, int age, boolean seal_stamp) {
        super(first_name, last_name, age);
        this.seal_stamp = seal_stamp;
    }

}
