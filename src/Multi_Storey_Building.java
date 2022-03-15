public class Multi_Storey_Building extends Building {

    protected boolean parkingExists;

    public Multi_Storey_Building(int width, int length, int pricePerSquareMeter, int height, int numberOfMaterial, int numberOfFloors, boolean parkingExists) {
        super(width, length, pricePerSquareMeter, height, numberOfMaterial, numberOfFloors);
        this.parkingExists = parkingExists;
    }

    public double ComputePriceForMultiStoreyBuilding(int priceForMaterial) {
        if(parkingExists){
            return (ComputePriceForBuilding(priceForMaterial)+(ComputePriceForBuilding(priceForMaterial)*0.10));
        } else {
            return ComputePriceForBuilding(priceForMaterial);
        }

    }


}
