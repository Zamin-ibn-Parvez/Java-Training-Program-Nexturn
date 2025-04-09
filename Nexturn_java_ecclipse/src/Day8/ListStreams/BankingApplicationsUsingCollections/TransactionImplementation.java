package Day8.ListStreams.BankingApplicationsUsingCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TransactionImplementation implements Transactions {

    static List<Account> accountList = new ArrayList<Account>();



    public void listOfAccounts(){
        System.out.println("This is the list of the accounts :");
        for (Account acc : TransactionImplementation.accountList) {
            System.out.println(acc);
        }
    }


    @Override
    public long createAccount(String customerName, double balance) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(8) + 1;
            sb.append(randomNumber);
        }
        long accountNumber = Long.parseLong(sb.toString());

        accountList.add(new Account(accountNumber, customerName, balance));

        return accountNumber;


    }

    @Override
    public double deposit(long accountNumber, double amount) {
        Predicate<Account> findAccount = (acc-> acc.getAccNumber()==accountNumber);
        return accountList.stream()
                .filter(findAccount)
                .findFirst()
                .map(acc -> {
                    acc.setBalance(acc.getBalance() + amount);
                    return acc.getBalance();
                })
                .orElseThrow(()-> new AccountNotFoundException());
    }


    @Override
    public double withdraw(long accountNumber, double amount) {
        Predicate<Account> findAccount = (acc-> acc.getAccNumber()==accountNumber);
        return accountList.stream()
                .filter(findAccount)
                .findFirst()
                .map(acc -> {
                    if (acc.getBalance() >= amount) {
                        acc.setBalance(acc.getBalance() - amount);
                        return acc.getBalance();
                    } else {
                        throw new InsufficientBalanceException();
                    }
                })
                .orElseThrow(()-> new AccountNotFoundException());
    }


    @Override
    public double checkBalance(long accountNumber) {
        Predicate<Account> findAccount = (acc-> acc.getAccNumber()==accountNumber);
        return accountList.stream()
                .filter(findAccount)
                .findFirst()
                .map(acc -> acc.getBalance())
                .orElseThrow(AccountNotFoundException::new);
    }

    @Override
    public List<Account> viewStatement(long accountNumber) {
        Predicate<Account> findAccount = (acc-> acc.getAccNumber()==accountNumber);
        return accountList.stream()
                .filter(findAccount)
                .collect(Collectors.toList());
    }

}
