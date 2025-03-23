package Day8.ListStreams.BankingApplicationsUsingCollections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private double amount;
    private LocalDateTime dateTime;
    private String type;
    private long accountNumber;


    public Transaction(double amount, LocalDateTime dateTime, String type, long accountNumber) {
        this.amount = amount;
        this.dateTime = dateTime;
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getType() {
        return type;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
