package bank;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private final List<Transaction> transactions = new ArrayList<>();
    private final StatementPrinter statementPrinter;
    private int balance = 0;

    public Account(StatementPrinter statementPrinter) {
        this.statementPrinter = statementPrinter;
    }

    @Override
    public void deposit(int amount) {
        transactions.add(new Transaction(amount, balance += amount));
    }

    @Override
    public void withdraw(int amount) {
        transactions.add(new Transaction(-amount, balance -= amount));
    }

    @Override
    public void printStatement() {
        statementPrinter.print(transactions);
    }
}
