/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class CargoShip extends Ship {

    private int maxCapacityTons;

    public CargoShip(int maxCapacityTons) {
        this.maxCapacityTons = maxCapacityTons;
    }

    public CargoShip(String name, String builtYear, int maxCapacityTons) {
        super(name, builtYear);
        this.maxCapacityTons = maxCapacityTons;
    }

    public String toString() {
        return "cargo ship name: " + super.getName() + " && cargo Capacity: " + maxCapacityTons;
    }
}
