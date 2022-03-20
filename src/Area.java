abstract public class Area {
    protected int width;
    protected int length;
    protected int price;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }

    public void setWidth(int width) {
        if(width>0){
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width cannot be null!");
        }
    }

    public void setLength(int length) {
       if(length>0){
           this.length = length;
       } else {
           throw new IllegalArgumentException("Length cannot be null!");
       }
    }

    public void setPrice(int price) {
        if(price>0){
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be null!");
        }
    }

    public Area() {

    }

    public Area(int width, int length, int price) {
        this.width = width;
        this.length = length;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Area = " +
                "width=" + width +
                ", length=" + length +
                ", price=" + price;
    }

}
