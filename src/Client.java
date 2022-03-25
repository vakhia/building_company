import Interfaces.IClient;

public final class Client extends Person implements IClient {
    private int moneyForBuilding;

    public void setMoneyForBuilding(int moneyForBuilding) {
        if(moneyForBuilding>0){
            this.moneyForBuilding = moneyForBuilding;
        } else {
            throw new IllegalArgumentException("Money cannot be null!");
        }
    }

    public int getMoneyForBuilding() {
        return moneyForBuilding;
    }

    public Client(){

    }

    public Client(String first_name, String last_name, int age, int moneyForBuilding) {
        super(first_name, last_name, age);
        this.moneyForBuilding = moneyForBuilding;
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
}
