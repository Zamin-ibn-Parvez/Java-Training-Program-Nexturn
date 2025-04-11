package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component (value = "car")
public class Car {
	@Autowired
	@Qualifier("mrf")
	Wheels wheels;
	
	public void moving() {
		wheels.rotate();
		System.out.println("The car is moving...");
	}
}
