import java.util.List;
public class Building extends Area {
    protected int height;
    private int price;
    private String type;

    public int getPrice() {
        return price;
    }

    public Building(int width, int length, int price, int height) {
        super(width, length, price);
        this.height = height;
    }

    public int Volume() {
        return (this.width * this.length * this.height);
    }

    public boolean Build(Building_Engineer building_engineer,List<Builder> builders, List<Material> materials,Foreman foreman, List<Crane> cranes, List<Dump_Trucks> dump_trucks) {
        if(building_engineer.CheckBlueprint()){
            return true;
        } else {
            return false;
        }
    }
}
