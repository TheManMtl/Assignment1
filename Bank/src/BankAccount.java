/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public abstract class BankAccount {

    private float balance;
    private int depositQuantity;
    private int withdrawQuantity;
    private float annualInterestRate;
    private float monthlyFee;

    public BankAccount(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getDepositQuantity() {
        return depositQuantity;
    }

    public void setDepositQuantity(int depositQuantity) {
        this.depositQuantity = depositQuantity;
    }

    public int getWithdrawQuantity() {
        return withdrawQuantity;
    }

    public void setWithdrawQuantity(int withdrawQuantity) {
        this.withdrawQuantity = withdrawQuantity;
    }

    public void deposit(float deposit) {
        balance += deposit;
        depositQuantity++;
    }

    public void withdraw(float withdraw) {
        balance += withdraw;
        withdrawQuantity--;
    }

    public void calInterest() {
        float monthlyInterestRate = annualInterestRate / 12;
        float monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public void monthlyProcess() {
        balance -= monthlyFee;
        calInterest();
        depositQuantity = 0;
        withdrawQuantity = 0;
        monthlyFee = 0;
    }
}
