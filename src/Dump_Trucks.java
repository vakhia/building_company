import java.util.Date;
import java.util.List;
public class Dump_Trucks extends Machinery{
    private List<Material> materials;

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Material material) {
        this.materials.add(material);
    }

    public Dump_Trucks(String title, int power, int fuel_capacity, Date date_of_creating){
        super(title, power, fuel_capacity, date_of_creating);
    }

    public Dump_Trucks(String title, int power, int fuel_capacity, Date date_of_creating,Material material) {
        super(title, power, fuel_capacity, date_of_creating);
        this.materials.add(material);
    }

    @Override
    public String toString() {
        return "Dump_Trucks =" +
                "materials=" + materials;
    }
}
