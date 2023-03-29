/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Demo {

    public static void main(String[] args) {

        //creating 3 Preferred Customers with random info

        Customer specialCustomer =
                new PreferredCustomer("J", "25", true, 1, 3519.25f);
        PreferredCustomer[] preferredCustomer = new PreferredCustomer[3];

        preferredCustomer[0] =
                new PreferredCustomer("J", "25", true, 1, 699.99f);
        preferredCustomer[0].setAddress("253 Sherbrooke W");
        preferredCustomer[0].setPhone("438888888");

        preferredCustomer[1] =
                new PreferredCustomer("Mr.rich", "15", true,2,1353.97f);
        preferredCustomer[2] =
                new PreferredCustomer("Mystery", "7", true,4,3458.99f);

        System.out.println("All Customers information");

        // iterating the customers
        for (PreferredCustomer c : preferredCustomer) {
            System.out.printf
                    ("Name: %s, Number: %s,phone: %s, address:%s, on mail list: %s, Level: %d, amount spent: %.2f \n"
                            , c.getName()
                            , c.getCustomerNumber()
                            , c.getPhone()
                            , c.getAddress()
                            , c.isOnMailing()
                            , c.getLevel()
                            , c.getAmount()
                    );
        }
    }
}
