package sample;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;
	@Column(length = 50)
	private String custName;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getcustName() {
		return custName;
	}
	public void setcustName(String custName) {
		this.custName = custName;
	}
	
	
	
	
	
	
	

}
