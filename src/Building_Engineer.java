public class Building_Engineer extends Person {
    private Blueprint blueprint;
    private Building building;

    public Building_Engineer(String first_name,String last_name,int age,Blueprint blueprint, Building building) {
        super(first_name,last_name,age);
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
}
