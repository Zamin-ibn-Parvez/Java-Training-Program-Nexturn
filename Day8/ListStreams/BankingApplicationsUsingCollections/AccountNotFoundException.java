package Day8.ListStreams.BankingApplicationsUsingCollections;

public class AccountNotFoundException extends RuntimeException{

    public AccountNotFoundException() {
        super("Account does not exist");
    }
}
