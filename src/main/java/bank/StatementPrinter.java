package bank;

import java.util.List;

public class StatementPrinter {
    public void print(List<Transaction> transactions) {
        System.out.println("DATE       || Amount | Balance");
        int runningBalance = 0;

        for (Transaction transaction : transactions) {
            runningBalance += transaction.amount();
            System.out.printf("%s || %d    || %d%n", "10-01-2012", transaction.amount(), runningBalance);
        }
    }
}