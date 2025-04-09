package Collections.ComparatorAndComparable;

import Collections.Question.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorting {

    public static void main(String[] args) {
        List < Employee> data = new ArrayList<Employee>();
        data.add(new Employee(201,"james", 8000));
        data.add(new Employee(301, "abcd",6000 ));
        data.add(new Employee(401, "xyz", 7000));



        Collections.sort(data , (e1, e2)->{
            return e1.getName().compareTo(e2.getName());
        });

        //Collections.sort(data , Comparator.comparing(Employee::getName)); This code snippet can be written in this way as well


        for(Employee emp : data){
            System.out.println(emp.getCode()+ " "+ emp.getSalary()+ " "+ emp.getName());
        }
        Collections.sort(data , (e1,e2)->{
            return (int) (e1.getSalary() - e2.getSalary());
        });

        for(Employee emp : data){
            System.out.println(emp.getCode()+ " "+ emp.getSalary()+ " "+ emp.getName());
        }

    }
}
