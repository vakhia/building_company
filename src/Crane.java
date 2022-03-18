import java.util.Date;

public class Crane extends Machinery{
    private int carrying_capacity;

    public void setCarrying_capacity(int carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    public Crane(String title, int power, int fuel_capacity, Date date_of_creating) {
        super(title, power, fuel_capacity, date_of_creating);
    }
}
