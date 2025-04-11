package Annotations;

import org.springframework.stereotype.Component;

@Component
public class Ceat implements Wheels {

	@Override
	public void rotate() {
		System.out.println("Ceat tyres are rotating....");
	}

}
