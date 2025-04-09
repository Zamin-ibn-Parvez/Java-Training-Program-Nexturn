package Day2.Encapsulation;

public class Employee {
    private String EmpName;
    private int EmpId;
    private double EmpSalary;
    private String EmpPhoneNo;

    public String getEmpPhoneNo() {
        return EmpPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        EmpPhoneNo = empPhoneNo;
    }

    public double getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(double empSalary) {
        EmpSalary = empSalary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }
}
