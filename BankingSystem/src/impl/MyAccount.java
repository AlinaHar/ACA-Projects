package impl;

import interfaces.Account;

public class MyAccount implements Account {
   private String uniqueId;
   private String name;
   private  String surname;
   private double balance;

   public MyAccount(String uniqueId, String name, String surname, double balance){
       this.uniqueId= uniqueId;
       this.name= name;
       this.surname= surname;
       this.balance= balance;
   }


    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance=balance;
    }
}
