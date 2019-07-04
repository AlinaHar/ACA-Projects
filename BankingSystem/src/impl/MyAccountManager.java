package impl;

import interfaces.Account;
import interfaces.AccountManager;

public class MyAccountManager implements AccountManager {
    private Account[] accounts;
    private int accountCounter;

    public MyAccountManager() {
        this.accounts = new Account[5555];
        this.accountCounter = 0;
    }


    @Override
    public void createNewAccount(Account account) {
        this.accounts[accountCounter] = account;
        accountCounter++;
    }

    @Override
    public void deleteAccount(Account account) {
        for (int i = 0; i < this.accounts.length; i++) {

            if(accounts[i].equals(account)){

                for (int j = 0; j < this.accounts.length; j++){

                    if(j<i){
                        accounts[j]=accounts[i];

                    }else
                    if(j==this.accounts.length-1){
                        accounts[j] = null;

                    } else  {
                        accounts[j]=accounts[i+1];
                        }
                }

            }
        }
    }

    @Override
    public Account searchAccount(String uniqueId) {
        for (int i = 0; i < this.accounts.length; i++) {

            if(accounts[i].getUniqueId().equals(uniqueId)){
                return accounts[i];
            }
        }
        return null;
    }
}
