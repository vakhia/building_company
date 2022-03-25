import Interfaces.IBuildingEngineer;

public final class BuildingEngineer extends Employee implements IBuildingEngineer {
    private Blueprint blueprint;
    private Building building;

    public Blueprint getBlueprint() {
        return blueprint;
    }

    public Building getBuilding() {
        return building;
    }

    public BuildingEngineer() {

    }

    public BuildingEngineer(String first_name, String last_name, int age, int price, Blueprint blueprint, Building building) {
        super(first_name, last_name, age, price);
        this.blueprint = blueprint;
        this.building = building;
    }

    public boolean CheckBlueprint() {
        if (blueprint.Volume() == building.Volume()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Building_Engineer =" +
                "blueprint =" + blueprint +
                ", building =" + building +
                '}';
    }
}
