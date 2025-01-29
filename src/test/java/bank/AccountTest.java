package bank;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AccountTest {
    @Test
    void print_statement_with_all_transactions() {
        StatementPrinter statementPrinter = mock(StatementPrinter.class);
        AccountService account = new Account(statementPrinter);

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();

        verify(statementPrinter).print(anyList());
    }
}
