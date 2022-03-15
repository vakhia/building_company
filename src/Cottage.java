public class Cottage extends Building{

    protected boolean poolExists;

    public Cottage(int width, int length, int pricePerSquareMeter, int height, int numberOfMaterial, int numberOfFloors,boolean poolExists) {
        super(width, length, pricePerSquareMeter, height, numberOfMaterial, numberOfFloors);
        this.poolExists = poolExists;
    }

    public double ComputePriceOfCottage(int priceForMaterial){
        if(poolExists){
            return (ComputePriceForBuilding(priceForMaterial)+(ComputePriceForBuilding(priceForMaterial)*0.35));
        } else {
            return ComputePriceForBuilding(priceForMaterial);
        }
    }

}
