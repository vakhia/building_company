import Interfaces.IBuilding;

import java.util.List;

public class Building extends Area implements IBuilding {
    protected int height;
    private String type;

    public Building() {
    }

    public Building(int width, int length, int price, int height, String type) {
        super(width, length, price);
        this.height = height;
        this.price = price;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int Volume() {
        return (this.width * this.length * this.height);
    }

    public boolean Build(BuildingEngineer building_engineer, List<Builder> builders, List<Material> materials, Foreman foreman, List<Crane> cranes, List<DumpTrucks> dump_trucks) {
        return building_engineer.CheckBlueprint();
    }

    @Override
    public String toString() {
        return "Building = " +
                "width =" + width +
                ", length =" + length +
                ", price =" + price +
                ", height =" + height +
                ", type='" + type + '\'';
    }

}
