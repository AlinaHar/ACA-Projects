package interfaces;

public interface TransactionManager {
    Transaction withdraw(Account accountToWithdraw, double amount);
    Transaction deposit(Account accountToFill, double amount);
    double getBalance(Account account);
    Transaction transfer(Account from, Account to, double amount);
}

