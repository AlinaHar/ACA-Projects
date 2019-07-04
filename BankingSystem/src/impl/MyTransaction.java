package impl;

import interfaces.Account;
import interfaces.Transaction;

public class MyTransaction implements Transaction {

    private String name;
    private Account targetAccount;
    private Account toAccount;

    public MyTransaction(String name, Account targetAccount){
        this.name=name;
        this.targetAccount=targetAccount;
    }

    public MyTransaction(String name, Account targetAccount, Account toAccount){
        this.name=name;
        this.targetAccount=targetAccount;
        this.toAccount=toAccount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Account getTargetAccount() {
        return targetAccount;
    }

    @Override
    public Account getToAccount() {
        return toAccount;
    }
}
