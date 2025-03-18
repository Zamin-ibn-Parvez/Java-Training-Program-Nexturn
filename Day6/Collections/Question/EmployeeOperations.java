package Day6.Collections.Question;

import Day6.Collections.Employee;

import java.util.ArrayList;

public class EmployeeOperations extends Employee{


    ArrayList <Employee> emplist = new ArrayList<Employee>();

    public void createEmployee(Employee emp){
        emplist.add(emp);
    }

    public Employee searchEmployee(int code){
        for(Employee emp : emplist){
            if(emp.getCode()== code) {
                return emp;
            }
        }
        return null;
    }

}

