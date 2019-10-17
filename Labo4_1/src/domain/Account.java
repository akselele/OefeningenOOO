package domain;

public class Account {
    private double balance;
    private String accountNumber;

    public Account(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
