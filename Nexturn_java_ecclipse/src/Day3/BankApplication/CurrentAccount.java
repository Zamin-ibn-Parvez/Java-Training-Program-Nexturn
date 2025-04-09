package Day3.BankApplication;

public class CurrentAccount extends Account{

    int overDraftfLimit;

    public CurrentAccount(String customerName, double balance, String accountType) {
        super(customerName, balance, accountType);
    }

    public void createAccount(){
        if(balance<10000){
            System.out.println("Account can't be created because the minimum balance is 10000 ");
        }
        else{
            accountNumber = 12345;
            overDraftfLimit = 5000;
            System.out.println("Successfully created the current account");
            System.out.println("Successfully created the savings account");
            System.out.println("AccountNumber :"+accountNumber);
            System.out.println("Name :" + customerName);
            System.out.println("Account Type :"+accountType);
            System.out.println("Balance is :" + balance);
            System.out.println("OverDraft Limit  is :"+overDraftfLimit);

        }

    }



}
