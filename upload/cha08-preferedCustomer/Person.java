/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Person {
    private String name;
    private String address;
    private String phone;

    //if no name provided
    public Person() {
        name = "Not identified";
        address = "Not shared";
        phone = "not provided";
    }

    // a person have a name
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
