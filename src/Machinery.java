import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

abstract public class Machinery {
    private String title;
    private int power;
    private int fuel_capacity;
    private Date date_of_creating;

    private void setTitle(String title) {
        if (title.length() > 0) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be null!");
        }
    }

    private void setPower(int power) {
        if (power > 0) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("Power cannot be nulL!");
        }
    }

    private void setFuel_capacity(int fuel_capacity) {
        if (fuel_capacity > 0) {
            this.fuel_capacity = fuel_capacity;
        } else {
            throw new IllegalArgumentException("Fuel capacity cannot be null!");
        }
    }

    private void setDate_of_creating(Date date_of_creating) {
        if (date_of_creating != null) {
            this.date_of_creating = date_of_creating;
        } else {
            throw new IllegalArgumentException("Date of creation cannot be null!");
        }
    }

    public Machinery(String title, int power, int fuel_capacity, Date date_of_creating) {
        this.setTitle(title);
        this.setPower(power);
        this.setFuel_capacity(fuel_capacity);
        this.setDate_of_creating(date_of_creating);
    }
}
