package Day8.ListStreams;

import Collections.Question.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {
    public static void main(String[] args) {
        List<Employee> data = new ArrayList<Employee>();
        data.add(new Employee(201,"james", 4000));
        data.add(new Employee(301, "Nicmar",6000 ));
        data.add(new Employee(401, "xyz", 7000));
        data.add(new Employee(501, "pqr", 9000));

        data.forEach((employee -> System.out.println(employee)));
        System.out.println("Salary greater than 5000");

       List<Employee> salwise =  data.stream()
               .filter(e -> e.getSalary() > 5000)
               .collect(Collectors.toList());

        salwise.forEach((employee -> System.out.println(employee)));

        System.out.println("Printing only salaries");

        List<Double> salaryList = data.stream()
                .map(e-> e.getSalary())
                .collect(Collectors.toList());
        System.out.println(salaryList);


    }
}
