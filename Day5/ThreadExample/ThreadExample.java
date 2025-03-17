package Day5.ThreadExample;

public class ThreadExample {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Thread t1 = new Thread(numbers);
        Thread t2 = new Thread(numbers);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}

