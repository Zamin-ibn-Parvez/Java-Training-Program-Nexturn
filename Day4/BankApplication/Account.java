package Day4.BankApplication;

abstract public class Account {
    protected long accountNumber;
    protected String customerName;
    protected double balance;
    protected String accountType;

    public Account(String customerName, double balance, String accountType){
        this.customerName = customerName;
        this.balance = balance;
        this.accountType = accountType;
    }

    abstract public void createAccount();



}






//Create a bank application using the following instructions:
//
//        1. Create class called Account with data members ->
//        account number, customer name, balance, account type.
//Define a parameterized constructor to accept
//        customer name, balance, account type.
//Define a method called createAccount() which can be overridden in the
//sub classes.
//        2. Create two classes called SavingsAccount and CurrentAccount by using
//Account class.
//        3. SavingsAccount should contain interestRate
//4. CurrentAccount should contain overDraftLimit
//5. Create class called BankApplication with main() and
//accept the inputs customer name, balance, account type
//and create either savings or current account based on the
//account type and display in clear format.
//
//    **account number should be defined with in the code.