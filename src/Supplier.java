import Exceptions.InvalidDataException;
import Interfaces.ISupplier;

public final class Supplier extends Person implements ISupplier {
    private Material material;

    public Supplier() {
    }

    public Supplier(String firstName, String lastName, int age, Material material) {
        super(firstName, lastName, age);
        this.material = material;

    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void Supply(Storage storage) throws InvalidDataException {
        storage.setMaterials(this.material);
    }

    @Override
    public String toString() {
        return "Supplier = " +
                "material =" + material;
    }

    @Override
    public void BuyMaterials(int money) {

    }

    @Override
    public String Transport(String position, int quantityOfMaterials) {
        return "Supplier transporting " + quantityOfMaterials + " of materials to" + position;
    }
}
