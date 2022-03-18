abstract public class Area {
    protected int width;
    protected int length;
    protected int price;

    private void setWidth(int width) {
        if(width>0){
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width cannot be null!");
        }
    }

    private void setLength(int length) {
       if(length>0){
           this.length = length;
       } else {
           throw new IllegalArgumentException("Length cannot be null!");
       }
    }

    private void setPrice(int price) {
        if(price>0){
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be null!");
        }
    }

    public Area(int width, int length, int price) {
        this.setLength(length);
        this.setPrice(price);
        this.setWidth(width);
    }
}
