public final class Contractor extends Employee {
    private boolean seal_stamp;

    public void setSeal_stamp(boolean seal_stamp) {
        this.seal_stamp = seal_stamp;
    }

    public boolean isSeal_stamp() {
        return seal_stamp;
    }

    public Contractor() {
    }

    public Contractor(String first_name, String last_name, int age, int price, boolean seal_stamp) {
        super(first_name, last_name, age, price);
        this.seal_stamp = seal_stamp;
    }

    @Override
    public String toString() {
        return "Contractor = " +
                "seal_stamp=" + seal_stamp;
    }
}
