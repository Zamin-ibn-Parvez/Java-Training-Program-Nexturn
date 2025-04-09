package java17Example;


public class SwitchExample {
	
	enum Months {
		JAN,FEB,MAR,APRIL,MAY,JUNE
	}
	

	public static void main(String[] args) {
		
		Months month = Months.MAR;
		int days = 0;
	
		switch (month) {
		case FEB -> days = 28;
		case JAN, MAR , MAY  -> days = 31;
		case APRIL, JUNE -> days = 30;	
		}
		
		System.out.println("Days in month = "+days);
		
		
		//using yield
		
		days = switch(month) {
		case JAN, MAR, MAY ->{
			yield 31;
		}
		case FEB ->{
			yield 30; 
		}
		case APRIL, JUNE ->{
			yield 30;
		}
		
		default -> throw new IllegalStateException();
		};
		System.out.println("Days = " + days);
		
		
}
}

		

