package Day9;


import Collections.Question.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortData {
    public static void main(String[] args) {
        List<Employee> empls = new ArrayList<Employee>();
        empls.add(new Employee(101,"Newton",4000));
        empls.add(new Employee(501,"Albert",8000));
        empls.add(new Employee(301,"Faraday",8000));
        empls.add(new Employee(401,"Hawking",7000));

        List<Employee> employee = empls.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(employee);
    }
}