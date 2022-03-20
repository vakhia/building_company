import java.util.Date;

public class Crane extends Machinery{
    private int carrying_capacity;

    public int getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(int carrying_capacity) {
        if(carrying_capacity>0){
            this.carrying_capacity = carrying_capacity;
        } else {
            throw new IllegalArgumentException("Carrying capacity cannot be null!");
        }
    }

    public Crane(String title, int power, int fuel_capacity, Date date_of_creating){
        super(title, power, fuel_capacity, date_of_creating);
    }

    public Crane(String title, int power, int fuel_capacity, Date date_of_creating,int carrying_capacity) {
        super(title, power, fuel_capacity, date_of_creating);
        this.carrying_capacity = carrying_capacity;
    }

    @Override
    public String toString() {
        return "Crane =" +
                "carrying_capacity=" + carrying_capacity;
    }
}
