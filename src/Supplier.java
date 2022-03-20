public class Supplier extends Person {
    private Material material;

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public Supplier() {
    }

    public Supplier(String first_name, String last_name, int age, Material material) {
        super(first_name, last_name, age);
        this.material = material;

    }

    public void Supply(Storage storage) {
        storage.setMaterials(this.material);
    }

    @Override
    public String toString() {
        return "Supplier = " +
                "material =" + material;
    }
}