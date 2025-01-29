package org.example;

import bank.Account;
import bank.StatementPrinter;

public class Main {
    public static void main(String[] args) {
        StatementPrinter statementPrinter = new StatementPrinter();
        Account account = new Account(statementPrinter);
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();
    }
}