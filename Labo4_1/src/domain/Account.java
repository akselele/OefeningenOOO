package domain;

import java.time.LocalDate;

public class Account {
    private double balance;
    private int accountNumber;
    private LocalDate dateOfCreation;

    public Account(double balance, int accountNumber){
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

    public int getAccountNumber() {
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
