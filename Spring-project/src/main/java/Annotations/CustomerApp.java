package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		
		Customer customer = context.getBean("cust", Customer.class);
		
		System.out.println(customer.getCode() + " "+ customer.getCustname()+ " " + customer.getCommision().getCommisionAmout());
	}

}
