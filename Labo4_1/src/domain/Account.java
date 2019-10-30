package domain;

import java.time.LocalDate;

public class Account {
    private double balance;
    private String accountNumber;
    private LocalDate dateOfCreation;

    public Account(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.dateOfCreation = LocalDate.now();
    }


    public void setAccountBalance(double newBalance){
        this.balance = newBalance;
    }

    public double getAccountBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString(){
        return "Creation date: " + this.dateOfCreation.toString() +"\nAccount Number: " + this.accountNumber + "\nAccount Balance: " + this.balance + "\n";
    }

    public LocalDate getCreationDate() {
        return dateOfCreation;
    }
}
