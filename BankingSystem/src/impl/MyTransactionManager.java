package impl;

import interfaces.Account;
import interfaces.Transaction;
import interfaces.TransactionManager;

import java.util.Scanner;

public class MyTransactionManager implements TransactionManager {
    private Account[] accounts;
    private double amount;

    public MyTransactionManager() {
        this.accounts = new Account[5555];
        this.amount = 0;
    }

    Scanner scan=new Scanner(System.in);

    public Transaction withdraw(Account accountToWithdraw, double amount){
        double balance=accountToWithdraw.getBalance();

        if (balance >= amount){
        balance-= amount;
        accountToWithdraw.setBalance(balance) ;
            Transaction withdraw = new MyTransaction("withdraw", accountToWithdraw) ;
        return withdraw;

        } return null;
    }

    public Transaction deposit(Account accountToFill, double amount){
        double balance=accountToFill.getBalance();
        balance += amount;
        accountToFill.setBalance(balance) ;
        Transaction deposit=new MyTransaction("deposit", accountToFill) ;
        return   deposit;
    }

    public double getBalance(Account account){
        return account.getBalance();
    }

    public Transaction transfer(Account from, Account to, double amount){

        if (from.getBalance() >= amount){
        from.setBalance(from.getBalance()-amount);
        to.setBalance(to.getBalance()+amount);
         Transaction transfer=new MyTransaction("transfer", from,  to);
        return transfer;

        } return null;
    }
}
