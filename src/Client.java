public class Client extends Person{
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
    public Client(String first_name, String last_name, int age){
        super(first_name, last_name, age);
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
}
