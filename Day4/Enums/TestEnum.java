package Day4.Enums;
import java.util.Scanner;
public class TestEnum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the day");
        String weekName = sc.nextLine().toLowerCase();
        Week day = Week.valueOf(weekName);
        switch(day){
            case monday:
            case tuesday:
            case wednesday:
            case thursday:
            case friday:
                System.out.println("Working Days");
            break;
            default:
                System.out.println("Weekend");

        }
    }
}

