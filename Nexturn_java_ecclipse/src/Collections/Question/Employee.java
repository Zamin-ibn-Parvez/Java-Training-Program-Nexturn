package Collections.Question;



import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int code;
    private String name;
    private double salary;


    public Employee(int code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo( Employee emp) {
        int diff = this.code - emp.getCode();
        return diff;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", name='" + name + '\'' + ", salary=" + salary +
                '}';
    }

}

