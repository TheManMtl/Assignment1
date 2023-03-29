/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class PiggyBank {

    private float balance;

    public PiggyBank() {
        this.balance = 0;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float addPenny() {
        return balance += 0.01f;
    }

    public float addNickle() {
        return balance += 0.05f;
    }

    public float addDime() {
        return balance += 0.10f;
    }

    public float addQuarter() {
        return balance += 0.25f;
    }

    public void takeOutMoney() {
        balance = 0;
    }


}
