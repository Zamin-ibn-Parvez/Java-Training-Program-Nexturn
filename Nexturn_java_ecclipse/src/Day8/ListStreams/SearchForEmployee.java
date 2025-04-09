package Day8.ListStreams;

import Collections.Question.Employee;
import Day4.ExceptionHandling.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SearchForEmployee {
    public static void main(String[] args) {
        List<Employee> data = new ArrayList<Employee>();
        data.add(new Employee(201, "james", 4000));
        data.add(new Employee(301, "Nicmar", 6000));
        data.add(new Employee(401, "xyz", 7000));
        data.add(new Employee(501, "pqr", 9000));

        try {
            Employee emp1 = data.stream()
                    .filter(e -> e.getCode() == 30)
                    .map(emp -> emp)
                    .findFirst()
                    .orElseThrow(() -> new EmployeeNotFoundException());
            System.out.println(emp1);
        }
        catch(EmployeeNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Completed");

    }
}
