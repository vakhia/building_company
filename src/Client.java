import Exceptions.InvalidNumberException;
import Interfaces.IBuilder;
import Interfaces.IClient;

public final class Client extends Person implements IClient {
    private int moneyForBuilding;


    public Client() {

    }

    public Client(String firstName, String lastName, int age, int moneyForBuilding) {
        super(firstName, lastName, age);
        this.moneyForBuilding = moneyForBuilding;
    }

    public int getMoneyForBuilding() {
        return moneyForBuilding;
    }

    public void setMoneyForBuilding(int moneyForBuilding) throws InvalidNumberException {
        if (moneyForBuilding > 0) {
            this.moneyForBuilding = moneyForBuilding;
        } else {
            throw new InvalidNumberException("Money cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Client = " +
                "moneyForBuilding=" + moneyForBuilding;
    }

    @Override
    public boolean Pay() {
        return true;
    }

    public static boolean Evaluate() {
        return true;
    }
}
