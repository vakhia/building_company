import Interfaces.IMaterial;

public final class Material implements IMaterial {
    protected int quantity;
    protected int pricePerEach;
    protected String type;

    public Material() {
    }

    public Material(int quantity, int pricePerEach, String type) {
        this.quantity = quantity;
        this.pricePerEach = pricePerEach;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerEach() {
        return pricePerEach;
    }

    public void setPricePerEach(int pricePerEach) {
        this.pricePerEach = pricePerEach;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Material = " +
                "quantity =" + quantity +
                ", pricePerEach =" + pricePerEach +
                ", type ='" + type;
    }

    @Override
    public int TotalPrice() {
        return this.quantity * this.pricePerEach;
    }
}
