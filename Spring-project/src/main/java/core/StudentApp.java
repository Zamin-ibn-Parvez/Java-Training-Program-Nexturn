package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	Student student = context.getBean("student", Student.class);
	
	System.out.println(student);
	System.out.println("The average marks are "+ student.calcAverage());
	System.out.println("The average marks are "+ student.total());
	
	
	

	}

}
