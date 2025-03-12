package Day2.Inheritance.Example1;

public class Student {
    protected int regNo;
    protected String stdName;
    protected String group;

    public Student(int regNo, String stdName, String group) {
        this.regNo = regNo;
        this.stdName = stdName;
        this.group = group;
    }

    public Student(){}


    public void display(){
        System.out.println(regNo + " "+ stdName+" "+ group);
    }


}
