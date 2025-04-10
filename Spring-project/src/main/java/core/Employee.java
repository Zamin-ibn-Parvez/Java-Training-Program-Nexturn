package core;

public class Employee {

	private int code;
	private String empname;
	private Address address;
	
	
	
	public Employee(int code, String empname) {
		this.code = code;
		this.empname = empname;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
