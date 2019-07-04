package interfaces;

public interface Transaction {
    String getName();

    Account getTargetAccount();

    Account getToAccount();

}
