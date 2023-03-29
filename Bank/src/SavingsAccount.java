/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class SavingsAccount extends BankAccount {
    private boolean isActive;
    private float withdraw;
    private float deposit;

    public SavingsAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public float getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(float withdraw) {
        this.withdraw = withdraw;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public boolean status() {
        isActive = !(getBalance() < 25);
        return isActive;
    }
    public void withdraw(float withdraw) {
        if (isActive) super.withdraw(deposit);
    }

    public void deposit(float deposit) {
        if (!isActive) {
            if (deposit + getBalance() > 25)
                isActive = true;
            super.deposit(deposit);
        }
    }

    public void monthlyProcess() {
        if (getWithdrawQuantity() > 4) {
            int overWithdraw = getWithdrawQuantity() - 4;
            setMonthlyFee(overWithdraw);
            if (!status()) isActive = false;
        }
    }
}
