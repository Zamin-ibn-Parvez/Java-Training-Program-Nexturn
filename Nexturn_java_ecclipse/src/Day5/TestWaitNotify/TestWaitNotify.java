package Day5.TestWaitNotify;

public class TestWaitNotify {
    public static void main(String[] args) {
        Transactions transactions = new Transactions();
        Runnable r1 = ()->{
            transactions.withdraw(8000);
        };
        Runnable r2 = ()->{
            transactions.deposit(5000);
        };
        Thread withdraw = new Thread(r1);
        Thread deposit = new Thread(r2);
        withdraw.start();
        deposit.start();


    }
}
