package Day9;

import java.time.LocalDate;
import java.util.Date;

public class DateExample{
    public static void main(String[] args) {
        System.out.println("default date using util.Date : "+new Date());
        LocalDate date1 = LocalDate.now();
        System.out.println("default date using LocalDate : "+date1);
        System.out.println("default datetime : "+LocalDate.now());
        System.out.println("default date plus 2 days : "+LocalDate.now().plusDays(2));
        System.out.println("default date plus 2 months : "+LocalDate.now().plusMonths(2));
        System.out.println("default date plus 3 years : "+LocalDate.now().plusYears(3));

        LocalDate dateBirth = LocalDate.of(2024,06,16);
        System.out.println(dateBirth);
        System.out.println(dateBirth.getDayOfMonth());
        System.out.println(dateBirth.getDayOfWeek());
        System.out.println(dateBirth.getYear());

        LocalDate cdate = LocalDate.now();
        System.out.println(cdate.compareTo(dateBirth));
        System.out.println(cdate.equals(cdate));
    }
}

