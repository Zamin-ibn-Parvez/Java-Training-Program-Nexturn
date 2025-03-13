package Day4.BankApplication;

public class SavingsAccount extends Account {

   protected int interestRate;

    public SavingsAccount(String customerName, double balance, String accountType) {
        super(customerName, balance, accountType);
    }

    public void createAccount(){
        accountNumber = 4567;
        interestRate = 5;
        System.out.println("Successfully created the savings account");
        System.out.println("AccountNumber :"+accountNumber);
        System.out.println("Name :" + customerName);
        System.out.println("Account Type :"+accountType);
        System.out.println("Balance is :" + balance);
        System.out.println("The interest rate is :"+interestRate);
    }


}
