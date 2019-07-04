package interfaces;

public interface AccountManager {
    void createNewAccount(Account account);

    void deleteAccount(Account account);

    Account searchAccount(String uniqueId);

}
