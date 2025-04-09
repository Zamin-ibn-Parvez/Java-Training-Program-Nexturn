package Day9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample2 {

    public static void main(String[] args) throws ParseException {
    	
    	
        String datestr = "20-03-2025";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = sdf.parse(datestr);
        System.out.println("dob :"+dob);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(datestr, formatter);
        System.out.println(localDate);
        System.out.println(LocalDate.now());
    }
    
}
