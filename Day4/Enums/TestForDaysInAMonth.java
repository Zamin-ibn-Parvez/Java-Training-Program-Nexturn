package Day4.Enums;

public class TestForDaysInAMonth {

    public static void main(String[] args) {
        Months month = Months.January;

        switch(month){
            case January:
            case March:
            case May:
            case July:
            case August:
            case October:
            case December:
                System.out.println("31 days");
                break;
            case April:
            case June:
            case September:
            case November:
                System.out.println("30 days");
                break;
            case February:
                System.out.println("28 days");
                break;
        }
    }


}
