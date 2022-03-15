public class Area {

    protected int pricePerSquareMeter;
    protected int width;
    protected int length;

    public Area(int width, int length,int pricePerSquareMeter) {
        this.width = width;
        this.length = length;
    }

    protected int ComputePrice() {
        return (this.width*this.length)*this.pricePerSquareMeter;
    }

}
