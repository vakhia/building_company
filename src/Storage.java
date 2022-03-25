import java.util.List;
public final class Storage extends Building {
    private List<Material> Materials;

    public void setMaterials(List<Material> materials) {
        Materials = materials;
    }

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

    public Storage() {}

    public Storage(int width, int length, int price, int height, String type, List<Material> materials) {
        super(width, length, price, height, type);
        Materials = materials;
    }
}
