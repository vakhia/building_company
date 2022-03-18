import java.util.List;

public class Storage extends Building {
    private List<Material> Materials;

     public void setMaterials(Material material) {
        if (Volume() > material.quantity) {
            this.Materials.add(material);
        } else {
            throw new IllegalArgumentException("Too many materials to fit this storage");
        }
    }

    public List<Material> getMaterials() {
        return Materials;
    }

    public Storage(int width, int length, int height, int price) {
        super(width, length, height, price);
    }

}
