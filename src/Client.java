public class Client extends Person{
    private int moneyForBuilding;

    public int getMoneyForBuilding() {
        return moneyForBuilding;
    }

    public Client(String first_name, String last_name, int age, int moneyForBuilding) {
        super(first_name, last_name, age);
        this.moneyForBuilding = moneyForBuilding;
    }
}
