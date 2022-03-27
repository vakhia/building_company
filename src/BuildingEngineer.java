import Interfaces.IBuildingEngineer;

public final class BuildingEngineer extends Employee implements IBuildingEngineer {
    private Blueprint blueprint;
    private Building building;


    public BuildingEngineer() {

    }

    public BuildingEngineer(String firstName, String lastName, int age, int price, Blueprint blueprint, Building building) {
        super(firstName, lastName, age, price);
        this.blueprint = blueprint;
        this.building = building;
    }

    public Blueprint getBlueprint() {
        return blueprint;
    }

    public Building getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return "Building_Engineer =" +
                "blueprint =" + blueprint +
                ", building =" + building +
                '}';
    }

    @Override
    public boolean CheckBlueprint() {
        return blueprint.Volume() == building.Volume();
    }
}
