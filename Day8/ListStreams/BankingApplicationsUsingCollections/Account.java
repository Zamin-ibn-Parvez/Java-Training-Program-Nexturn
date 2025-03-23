package Day8.ListStreams.BankingApplicationsUsingCollections;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private long accNumber;
    private String customerName;
    private double balance;


    public Account(long accNumber, String customerName, double balance) {
        this.accNumber = accNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Employee Details --> Account Number : " + getAccNumber() + ", Customer Name : " + getCustomerName() + ", Balance :" + getBalance();
    }

    static List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }



}



