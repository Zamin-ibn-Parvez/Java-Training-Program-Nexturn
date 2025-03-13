package Day4.BankApplication;

public class CurrentAccount extends Account {

    int overDraftfLimit;

    public CurrentAccount(String customerName, double balance, String accountType) {
        super(customerName, balance, accountType);
    }

    public void createAccount() {

        try {
            if (balance < 10000) {
                throw new InsufficientBalanceException("Insufficient balance to create savings account : Minimum balance required is greater than 10,000");
            }

            accountNumber = 12345;
            overDraftfLimit = 5000;
            System.out.println("Successfully created the current account");
            System.out.println("Successfully created the savings account");
            System.out.println("AccountNumber :" + accountNumber);
            System.out.println("Name :" + customerName);
            System.out.println("Account Type :" + accountType);
            System.out.println("Balance is :" + balance);
            System.out.println("OverDraft Limit  is :" + overDraftfLimit);

        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
