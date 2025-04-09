package Day5.ThreadExample;

public class Numbers implements Runnable{
    @Override
    public synchronized void run() {
        System.out.println("Thread name is :" + Thread.currentThread().getName());
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " ");
        }
    }
}

