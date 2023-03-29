/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class CruiseShip extends Ship{

    private int maxPassenger;

    public CruiseShip(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public CruiseShip(String name, String builtYear, int maxPassenger) {
        super(name, builtYear);
        this.maxPassenger = maxPassenger;
    }

    public CruiseShip(String name, String builtYear) {
        super(name, builtYear);
    }

    public String toString() {
        return "cruise ship name: " + super.getName() + " && cruise Capacity: " + maxPassenger;
    }

}
