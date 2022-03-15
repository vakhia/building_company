public class Building extends Area {
    protected int height;
    protected int numberOfMaterial;
    protected int numberOfFloors;

    public Building(int width, int length, int pricePerSquareMeter, int height,int numberOfMaterial,int numberOfFloors) {
        super(width, length, pricePerSquareMeter);
        this.height = height;
        this.numberOfMaterial = numberOfMaterial;
        this.numberOfFloors = numberOfFloors;
    }

    public int ComputePriceForBuilding(int priceForTheMaterial) {
        return ((ComputePrice()*(this.numberOfMaterial*priceForTheMaterial))*numberOfFloors);
    }


}
