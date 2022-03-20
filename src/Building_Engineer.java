public class Building_Engineer extends Employee {
    private Blueprint blueprint;
    private Building building;

    public Blueprint getBlueprint() {
        return blueprint;
    }

    public Building getBuilding() {
        return building;
    }

    public Building_Engineer(String first_name, String last_name, int age, int price) {
        super(first_name, last_name, age, price);
    }

    public Building_Engineer(String first_name, String last_name, int age, int price, Blueprint blueprint, Building building) {
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
