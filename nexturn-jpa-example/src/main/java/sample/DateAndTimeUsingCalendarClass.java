package sample;

import java.util.Date;
import java.util.Calendar;

public class DateAndTimeUsingCalendarClass {
	    public static void main(String[] args) {
	        // Create a Date object representing the current date and time
	        Date currentDate = new Date();
	        System.out.println("Current Date: " + currentDate);

	        // Create a Calendar object and set it to the current date and time
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(currentDate);

	        // Add time to the Calendar object
	        // For example, add 2 hours, 30 minutes, and 45 seconds
	        calendar.add(Calendar.HOUR_OF_DAY, 2);
	        calendar.add(Calendar.MINUTE, 30);
	        calendar.add(Calendar.SECOND, 45);

	        // Get the updated Date object
	        Date updatedDate = calendar.getTime();
	        System.out.println("Updated Date: " + updatedDate);
	    }
	}


