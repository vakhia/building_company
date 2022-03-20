import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

abstract public class Machinery {
    private String title;
    private int power;
    private int fuel_capacity;
    private Date date_of_creating;

    public String getTitle() {
        return title;
    }

    public int getPower() {
        return power;
    }

    public int getFuel_capacity() {
        return fuel_capacity;
    }

    public Date getDate_of_creating() {
        return date_of_creating;
    }


    public void setTitle(String title) {
        if (title.length() > 0) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be null!");
        }
    }

    public void setPower(int power) {
        if (power > 0) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("Power cannot be nulL!");
        }
    }

    public void setFuel_capacity(int fuel_capacity) {
        if (fuel_capacity > 0) {
            this.fuel_capacity = fuel_capacity;
        } else {
            throw new IllegalArgumentException("Fuel capacity cannot be null!");
        }
    }

    public void setDate_of_creating(Date date_of_creating) {
        if (date_of_creating != null) {
            this.date_of_creating = date_of_creating;
        } else {
            throw new IllegalArgumentException("Date of creation cannot be null!");
        }
    }

    public Machinery(){

    }

    public Machinery(String title, int power, int fuel_capacity, Date date_of_creating) {
        this.title = title;
        this.power = power;
        this.fuel_capacity = fuel_capacity;
        this.date_of_creating = date_of_creating;
    }

    @Override
    public String toString() {
        return "Machinery = " +
                "title ='" + title + '\'' +
                ", power =" + power +
                ", fuel_capacity =" + fuel_capacity +
                ", date_of_creating =" + date_of_creating;
    }
}
