package Day9;

import Collections.Question.Employee;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        ArrayList<Employee> empls = new ArrayList<Employee>();
        empls.add(new Employee(101, "Zain", 10000));
        empls.add(new Employee(102, "Zamin", 20000));
        empls.add(new Employee(103, "Parveez", 30000));

        //Defining the predicate functional interface
        Predicate<Employee>  salPredicate = (empl) -> empl.getSalary()>20000;
        Predicate<Employee> codePredicate = (empl)-> empl.getCode() ==102;

        System.out.println("Predicate Example");

        for(Employee emp : empls){
            if(codePredicate.test(emp))
                System.out.println(emp);
        }

        for(Employee emp : empls){
            if(salPredicate.test(emp))
                System.out.println(emp);
        }

    }
}
