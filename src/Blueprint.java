public class Blueprint {
    private int widthOfBuilding;
    private int lengthOfBuilding;
    private int heightOfBuilding;

    private void setWidthOfBuilding(int widthOfBuilding) {
        if (widthOfBuilding > 0) {
            this.widthOfBuilding = widthOfBuilding;
        } else {
            throw new IllegalArgumentException("Width cannot be null!");
        }
    }

    private void setLengthOfBuilding(int lengthOfBuilding) {
        if (lengthOfBuilding > 0) {
            this.lengthOfBuilding = lengthOfBuilding;
        } else {
            throw new IllegalArgumentException("Length cannot be null!");
        }
    }

    private void setHeightOfBuilding(int heightOfBuilding) {
        if (heightOfBuilding > 0) {
            this.heightOfBuilding = heightOfBuilding;
        } else {
            throw new IllegalArgumentException("Height cannot be null!");
        }
    }

    public Blueprint(int widthOfBuilding, int lengthOfBuilding, int heightOfBuilding) {
        this.setHeightOfBuilding(heightOfBuilding);
        this.setLengthOfBuilding(lengthOfBuilding);
        this.setWidthOfBuilding(widthOfBuilding);
    }

    public double Volume(){
        return (this.widthOfBuilding*this.heightOfBuilding*this.lengthOfBuilding);
    }

}
