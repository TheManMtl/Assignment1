/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class PreferredCustomer extends Customer{
    private int level;
    private float amount;

    //to be a preferred customer all info is needed
    public PreferredCustomer(String name, String customerNumber, boolean isOnMailing, int level, float amount) {
        super(name, customerNumber, isOnMailing);
        this.level = level;
        this.amount = amount;
    }

    private PreferredCustomer(String name, String customerNumber, boolean isOnMailing) {
        super(name, customerNumber, isOnMailing);
    }

    private PreferredCustomer(String customerNumber, boolean isOnMailing) {
        super(customerNumber, isOnMailing);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
