import Interfaces.IBlueprint;

public final class Blueprint implements IBlueprint {
    private int widthOfBuilding;
    private int lengthOfBuilding;
    private int heightOfBuilding;

    public Blueprint() {

    }

    public Blueprint(int widthOfBuilding, int lengthOfBuilding, int heightOfBuilding) {
        this.widthOfBuilding = widthOfBuilding;
        this.lengthOfBuilding = lengthOfBuilding;
        this.heightOfBuilding = heightOfBuilding;
    }

    public int getWidthOfBuilding() {
        return widthOfBuilding;
    }

    public void setWidthOfBuilding(int widthOfBuilding) {
        if (widthOfBuilding > 0) {
            this.widthOfBuilding = widthOfBuilding;
        } else {
            throw new IllegalArgumentException("Width cannot be null!");
        }
    }

    public int getLengthOfBuilding() {
        return lengthOfBuilding;
    }

    public void setLengthOfBuilding(int lengthOfBuilding) {
        if (lengthOfBuilding > 0) {
            this.lengthOfBuilding = lengthOfBuilding;
        } else {
            throw new IllegalArgumentException("Length cannot be null!");
        }
    }

    public int getHeightOfBuilding() {
        return heightOfBuilding;
    }

    public void setHeightOfBuilding(int heightOfBuilding) {
        if (heightOfBuilding > 0) {
            this.heightOfBuilding = heightOfBuilding;
        } else {
            throw new IllegalArgumentException("Height cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Blueprint = " +
                "width of building =" + widthOfBuilding +
                ", length of building =" + lengthOfBuilding +
                ", height of building =" + heightOfBuilding;
    }

    @Override
    public double Volume() {
        return this.heightOfBuilding * this.widthOfBuilding * this.lengthOfBuilding;
    }
}
