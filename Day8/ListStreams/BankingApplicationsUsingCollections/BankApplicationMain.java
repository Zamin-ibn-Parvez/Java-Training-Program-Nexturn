package Day8.ListStreams.BankingApplicationsUsingCollections;

import java.util.List;
import java.util.Scanner;

public class BankApplicationMain {
    public static void main(String[] args) {
        while (true) {

            System.out.println("c - create account");
            System.out.println("d - deposit");
            System.out.println("w - withdraw");
            System.out.println("b - balance check");
            System.out.println("s - view statement");
            System.out.println("x - exit");

            System.out.println("Select an option from the below options given :");
            TransactionImplementation transaction = new TransactionImplementation();
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);

            switch (ch) {

                case 'c':
                    transaction.listOfAccounts();
                    System.out.println("Enter the name by which the account will be created");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter the balance for the account");
                    double balance = sc.nextDouble();

                    long account = transaction.createAccount(name, balance);
                    System.out.println("The account has been created successfully with the account number as :" + account);
                    break;

                case 'd':
                    transaction.listOfAccounts();
                    System.out.println("Enter the account number in which the amount needs to be deposited :");
                    long accountNumberDeposit = sc.nextLong();
                    System.out.println("Enter the amount that needs to be deposited :");
                    double amountDeposit = sc.nextDouble();
                    double updatedBalanceDeposit = transaction.deposit(accountNumberDeposit, amountDeposit);
                    System.out.println("The total balance now after depositing in Account No. " + accountNumberDeposit + " is :" + updatedBalanceDeposit);
                    break;


                case 'w':
                    transaction.listOfAccounts();

                    System.out.println("Enter the account number in which the amount needs to be withdrawn :");

                    long accountNumberWithdraw = sc.nextLong();
                    System.out.println("Enter the amount that needs to be withdrawn :");
                    double amountWithdraw = sc.nextDouble();

                    double updatedBalanceWithdraw = transaction.withdraw(accountNumberWithdraw, amountWithdraw);
                    System.out.println("The total balance now after withdrawing from Account No. " + accountNumberWithdraw + " is :" + updatedBalanceWithdraw);
                    break;
                case 'b':
                    transaction.listOfAccounts();
                    System.out.println("Enter the account number for which you need to check the balance :");
                    long accountNumberBalance = sc.nextLong();
                    try {
                        double balanceCheck = transaction.checkBalance(accountNumberBalance);
                        System.out.println("The balance in Account No. " + accountNumberBalance + " is :" + balanceCheck);
                    } catch (AccountNotFoundException e) {
                        System.out.println("Account not found");
                    }
                    break;

                case 's':
                    transaction.listOfAccounts();
                    System.out.println("Enter the account number for which you need to view the statement :");
                    long accountNumberStatement = sc.nextLong();
                    try {
                        List<Account> statement = transaction.viewStatement(accountNumberStatement);
                        System.out.println("The statement for Account No. " + accountNumberStatement + " is :" + statement);
                    } catch (AccountNotFoundException e) {
                        System.out.println("Account not found");
                    }
                    break;

                case 'x':
                    return;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");


            }
        }

    }
}


