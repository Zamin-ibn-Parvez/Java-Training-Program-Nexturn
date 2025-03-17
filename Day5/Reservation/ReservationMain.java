package Day5.Reservation;


public class ReservationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Railway Reservation System!");


        Reservation reservation = new Reservation();
        // Creating threads for different passengers
        Thread t1 = new Thread(reservation);
        Thread t2 = new Thread(reservation);
        Thread t3 = new Thread(reservation);
        t1.setName("james");
        t2.setName("Bob");
        t3.setName("Nexturn");


        //Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}

