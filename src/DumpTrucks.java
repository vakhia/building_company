import Interfaces.IDumpTrucks;

import java.util.Date;
import java.util.List;

public final class DumpTrucks extends Machinery implements IDumpTrucks {
    private List<Material> materials;

    public DumpTrucks() {
    }

    public DumpTrucks(String title, int power, int fuel_capacity, Date dateOfCreating, Material material) {
        super(title, power, fuel_capacity, dateOfCreating);
        this.materials.add(material);
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Material material) {
        this.materials.add(material);
    }

    @Override
    public String toString() {
        return "Dump_Trucks =" + "materials=" + materials;
    }

    @Override
    public String Transport() {
        return "Transporting materials...";
    }
}
