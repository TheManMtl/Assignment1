/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

/*
* The application is to practice inheritance
* Parent: Person
* Child: Customer
*
* creating customers using Parents constructor and customer's.
* */
public class Demo {

    public static void main(String[] args) {

        //creating 5 customers with random info
        Customer[] customers = new Customer[5];

        customers[0] = new Customer("Name A", "250", false);
        customers[0].setAddress("253 Sherbrooke W");
        customers[0].setPhone("438888888");

        customers[1] = new Customer("Name B", "302", true);
        customers[2] = new Customer("400", true);
        customers[3] = new Customer("105", true);
        customers[3].setName("Name super");
        customers[3].setPhone("5146583256");
        customers[3].setOnMailing(false);
        customers[4] = new Customer("Name C", "302", true);
        customers[4].setAddress("ottawa");
        System.out.println("All Customers information");

        // iterating the customers
        for (Customer c : customers) {
            System.out.printf("Name: %s, Number: %s,phone: %s, address:%s, on mail list: %s\n"
                    , c.getName()
                    , c.getCustomerNumber()
                    , c.getPhone()
                    , c.getAddress()
                    , c.isOnMailing());
        }
    }
}
