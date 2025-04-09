package Day2.Encapsulation;

public class Account {
    private int accNo;
    private String name;
    private double balance;

    //Default Constructor
    public Account() {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    //Parameterized Overloaded Constructor
    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAccNO() {
        return accNo;
    }

    public void setAccNO(int accNO) {
        this.accNo = accNO;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
