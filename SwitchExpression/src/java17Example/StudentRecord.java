package java17Example;

public record StudentRecord(int rollNo , String name, int marks) {

	public int rollNo() {
		return rollNo;
	}

	public String name() {
		return name;
	}

	public int marks() {
		return marks;
	}
	
	

}
