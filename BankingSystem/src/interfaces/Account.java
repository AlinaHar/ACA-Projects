package interfaces;

public interface Account {
    String getUniqueId();
    String getName();
    String getSurname();
    double getBalance();
    void setBalance(double balance);
    //...
}
