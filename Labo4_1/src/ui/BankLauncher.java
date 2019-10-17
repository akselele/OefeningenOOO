package ui;

import domain.Account;
import domain.Bank;

public class BankLauncher {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = new Account(1200,"BE48621188");
        bank.openAccount(account);
    }
}
