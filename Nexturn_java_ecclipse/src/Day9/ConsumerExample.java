package Day9;

import Collections.Question.Employee;

import java.util.ArrayList;
import java.util.function.Consumer;


public class ConsumerExample {

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee(101, "Zain", 10000));
        empList.add(new Employee(102, "Zaid",56899.98));

        empList.forEach((emp)->{
            System.out.println(emp);
        });





        //Consumer Example

        Consumer<Employee> consumer = (emp) ->{
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());
        };

        consumer.accept(new Employee(102,"Zain",45000));


    }

}

