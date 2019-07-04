
import impl.MyAccount;
import impl.MyAccountManager;
import impl.MyTransactionManager;
import interfaces.Account;
import interfaces.AccountManager;
import interfaces.TransactionManager;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("----HI----");
        System.out.println("Lets see the details for your newly created account before we make any transaction..");


        Account account = new MyAccount("1","Alina","Harutyunyan",50000);
        AccountManager accountManager = new MyAccountManager();
        accountManager.createNewAccount(account);

        System.out.println("ID: " + account.getUniqueId());
        System.out.println("Name: "+account.getName());
        System.out.println("Surname: "+account.getSurname());
        System.out.println("Balance: "+account.getBalance());

        System.out.println("----------");
        System.out.println("Please select the transaction type you want to make");
        int input;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Get Balance");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println("Enter amount to deposit: ");
                double amount = scan.nextDouble();
                TransactionManager transactionManager = new MyTransactionManager();
                transactionManager.deposit(account,amount);
                System.out.println("Your new balance is");
                System.out.println(account.getBalance());

            } else if (input == 2) {

                System.out.println("Enter amount to withdrawal: ");
                double amount = scan.nextDouble();
                TransactionManager transactionManager = new MyTransactionManager();
                transactionManager.withdraw(account, amount);
                System.out.println("Your new balance is");
                System.out.println(account.getBalance());

            } else if (input == 3) {

                System.out.println("Your current balance is: ");
                System.out.println( account.getBalance() );

            }  else if (input == 4) {
                System.out.println("Enter amount to transfer: ");
                double amount = scan.nextDouble();

                Account accountTo = new MyAccount("3","Anna","Minasyan",3000);
                accountManager.createNewAccount(accountTo);
                System.out.println("Lets see the details for the account to which you want to transfer money..");

                System.out.println("ID: " + accountTo.getUniqueId());
                System.out.println("Name: "+accountTo.getName());
                System.out.println("Surname: "+accountTo.getSurname());
                System.out.println("Balance: "+accountTo.getBalance());
                TransactionManager transactionManager = new MyTransactionManager();
                System.out.println("Your balance befpre transfer is: ");
                System.out.println( account.getBalance() );
                transactionManager.transfer(account, accountTo, amount);
                System.out.println("Your new balance after transfer is: ");
                System.out.println( account.getBalance() );

            }
        } while (input != 5);

        System.out.println("Good Bye!");

    }
    }


