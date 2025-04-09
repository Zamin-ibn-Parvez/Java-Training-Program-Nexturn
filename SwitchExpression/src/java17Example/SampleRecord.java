package java17Example;

public record SampleRecord(int regNo, String stdName) {

	public int regNo() {
		return regNo;
	}

	public String stdName() {
		return stdName;
	}
	
	
}

