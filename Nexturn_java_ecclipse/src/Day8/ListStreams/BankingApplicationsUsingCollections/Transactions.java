package Day8.ListStreams.BankingApplicationsUsingCollections;

import java.util.List;

public interface Transactions {
        long createAccount(String customerName, double balance);
        double deposit(long accountNumber, double amount);
        double withdraw(long accountNumber, double amount);
        double checkBalance(long accountNumber);
        List<Account> viewStatement(long accountNumber);
    }

