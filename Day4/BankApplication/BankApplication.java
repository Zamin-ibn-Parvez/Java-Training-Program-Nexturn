package Day4.BankApplication;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String customerName = sc.nextLine();
        System.out.println("Enter Your Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Your Account Type : ");
        String accountType = sc.nextLine();

        if(accountType.equalsIgnoreCase("Savings Account")){

                SavingsAccount savingsAccount = new SavingsAccount(customerName,balance,accountType);
                savingsAccount.createAccount();
            }
        else if(accountType.equalsIgnoreCase("Current Account")){
            CurrentAccount currentAccount = new CurrentAccount(customerName,balance,accountType);
            currentAccount.createAccount();
        }
        else{
            System.out.println("Invalid Account Type");
        }


        }


}
