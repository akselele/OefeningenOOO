package ui;

import domain.Account;
import domain.Bank;

public class BankLauncher {
    public static void main(String[] args) {
        Bank bank = new Bank("KBC");
        bank.openAccount(2500);
    }
}
