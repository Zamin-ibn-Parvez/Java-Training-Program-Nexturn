package Day5.Reservation;
import java.util.Scanner;

public class Reservation implements Runnable{
        private int availableBerths = 10; // Shared resource
        private int requestedBerths;


        @Override
        public synchronized void run() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome : "+Thread.currentThread().getName());
            System.out.println("Available Berths : "+availableBerths);

            if(availableBerths!=0){
                System.out.println("Enter the required berths :");
                requestedBerths = sc.nextInt();
                if(requestedBerths<=availableBerths){
                    availableBerths-=requestedBerths;
                    System.out.println(requestedBerths+ " alloted to "+Thread.currentThread().getName());
                }

            }
            else{
                System.out.println("Sorry no berths available");
            }
        }

    }

