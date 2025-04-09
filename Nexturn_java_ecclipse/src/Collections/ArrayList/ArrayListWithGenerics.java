package Collections.ArrayList;

import Collections.Question.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithGenerics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> emplist = new ArrayList<Employee>();
        for(int i=0;i<2;i++){
            System.out.println("Enter the Employee code");
            int code = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Employee Name");
            String name = sc.nextLine();
            System.out.println("Enter the Employee Salary");
            double salary = sc.nextDouble();
            emplist.add(new Employee(code, name, salary));
        }


        for(Employee emp : emplist ){
            System.out.println(emp.getCode()+ " "+ emp.getSalary() + " "+ emp.getName());
        }
    }
}
