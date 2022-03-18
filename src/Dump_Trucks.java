import java.util.Date;
import java.util.List;
public class Dump_Trucks extends Machinery{
    private List<Material> materials;

    private void setMaterials(Material material) {
        this.materials.add(material);
    }

    public Dump_Trucks(String title, int power, int fuel_capacity, Date date_of_creating,Material material) {
        super(title, power, fuel_capacity, date_of_creating);
        this.setMaterials(material);
    }
}
