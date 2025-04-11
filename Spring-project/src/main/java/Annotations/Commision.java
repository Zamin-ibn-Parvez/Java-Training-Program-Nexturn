package Annotations;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Commision {
	
	@Value("45000")
	private double commisionAmout;
	
	public void setCommisionAmout(double commisionAmout) {
		this.commisionAmout = commisionAmout;
	}
	
	public double getCommisionAmout() {
		return commisionAmout;
	}
	

}
