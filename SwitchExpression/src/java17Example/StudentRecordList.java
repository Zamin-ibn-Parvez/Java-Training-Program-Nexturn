package java17Example;

import java.util.ArrayList;
import java.util.List;

public class StudentRecordList {
	public static void main(String[] args) {
		StudentRecord std = new StudentRecord(101, "Zain", 300);
		System.out.println(std);
	
		
		List<StudentRecord> stdList = new ArrayList<StudentRecord>();
		stdList.add(new StudentRecord(103, "Zamin", 500));
		stdList.add(new StudentRecord(104, "Parveez", 500));
		stdList.add(new StudentRecord(105, "Adam", 500));
		stdList.add(new StudentRecord(106, "Charlette", 500));
		
		stdList.forEach((s)->System.out.println(s.rollNo()+ s.name()+ s.marks()));
		
		
	}

}
