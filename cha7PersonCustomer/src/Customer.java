/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Customer extends Person {
    private String customerNumber;
    private boolean isOnMailing;

    public Customer(String name, String customerNumber, boolean isOnMailing) {
        super(name);
        this.customerNumber = customerNumber;
        this.isOnMailing = isOnMailing;
    }

    public Customer(String customerNumber, boolean isOnMailing) {
        this.customerNumber = customerNumber;
        this.isOnMailing = isOnMailing;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOnMailing() {
        return isOnMailing;
    }

    public void setOnMailing(boolean onMailing) {
        isOnMailing = onMailing;
    }
}
