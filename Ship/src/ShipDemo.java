/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class ShipDemo {
    public static void main(String[] args) {
        Ship generalShipA = new Ship("Atlantic", "2012");
        Ship generalShipB = new Ship("Shipper", "1985");
        CruiseShip titanic = new CruiseShip("Titanic", "1931", 3320);
        CruiseShip achille = new CruiseShip("Achille Lauro", "1939", 869);
        CruiseShip allure = new CruiseShip("Allure of the Seas", "2008", 5400);

        CargoShip marco = new CargoShip("CMA CGM Marco Polo", "2003", 15000);
        CargoShip iran = new CargoShip("persian Cargo oil", "2003", 25000);
        CargoShip canada = new CargoShip("Canadian Cargo seeds", "1970", 35000);

        Ship[] allShips = new Ship[8];

        allShips[0] = generalShipA;
        allShips[1] = generalShipB;
        allShips[2] = titanic;
        allShips[3] = achille;
        allShips[4] = allure;
        allShips[5] = marco;
        allShips[6] = iran;
        allShips[7] = canada;

        for (Ship s: allShips) System.out.println(s.toString());
    }
}
