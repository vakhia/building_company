import Interfaces.IContractor;

public final class Contractor extends Employee implements IContractor {
    private boolean sealStamp;

    public Contractor() {
    }

    public Contractor(String firstName, String lastName, int age, int price, boolean sealStamp) {
        super(firstName, lastName, age, price);
        this.sealStamp = sealStamp;
    }

    public boolean isSealStamp() {
        return sealStamp;
    }

    public void setSealStamp(boolean sealStamp) {
        this.sealStamp = sealStamp;
    }

    @Override
    public String toString() {
        return "Contractor = " +
                "sealStamp=" + sealStamp;
    }

    @Override
    public boolean Sign() {
        return true;
    }
}
