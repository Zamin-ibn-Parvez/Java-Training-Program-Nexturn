package Day5.TestWaitNotify;

public class Transactions{
    int balance = 5000;

    synchronized void withdraw(int amount){
            System.out.println("Available balance : " +this.balance);
            System.out.println("Trying to withdraw : " +amount);
            if(this.balance < amount){
                System.out.println("Less balance , waiting for deposit...");
                try {
                    wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            this.balance -= amount;
            System.out.println("Withdrawal successful , Available balance is : " +this.balance);
    }

    synchronized void deposit(int amount){
        System.out.println("Available balance : " +this.balance);
        System.out.println("Trying to deposit : " +amount);
        try{
            Thread.sleep(5000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        this.balance += amount;
        System.out.println("Deposit successful , Available balance is : " +this.balance);
        notify();
    }
}
