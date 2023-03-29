/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Ship {
    private String name;
    private String builtYear;

    public Ship() {
        name = "not provided.";
        builtYear = "unknown";
    }

    public Ship(String name, String builtYear) {
        this.name = name;
        this.builtYear = builtYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(String builtYear) {
        this.builtYear = builtYear;
    }

    public String toString() {
        return "General ship name: " + name + " && Built Year: " + builtYear;
    }
}
