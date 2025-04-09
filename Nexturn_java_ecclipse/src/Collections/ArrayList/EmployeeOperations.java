package Collections.ArrayList;

import Collections.Question.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeOperations extends Employee {


    ArrayList<Employee> emplist = new ArrayList<Employee>();


    public void createEmployee(Employee emp) {
        emplist.add(emp);
    }

    public Employee searchEmployee(int code) {
        for (Employee emp : emplist) {
            if (emp.getCode() == code) {
                return emp;
            }
        }
        return null;
    }

    public void displayEmployees() {
        Collections.sort(emplist, (e1, e2) -> {
            return e1.getCode() - e2.getCode();
        });

        for (Employee emp : emplist) {

            System.out.println("Employee code " + emp.getCode() + " Employee Name " + emp.getName() + " Employee Salary " + emp.getSalary());

        }
    }
}

