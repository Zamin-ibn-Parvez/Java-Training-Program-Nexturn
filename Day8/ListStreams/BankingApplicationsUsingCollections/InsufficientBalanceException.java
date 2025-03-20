package Day8.ListStreams.BankingApplicationsUsingCollections;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException() {
        super("Insufficient balance in the account");
    }
}
