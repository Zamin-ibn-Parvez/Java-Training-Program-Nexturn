package Day9;

import Collections.Question.Employee;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        int m =10;
        Supplier<Integer> sup = ()->{
            return m+5;
        };
        System.out.println("supplier :" +sup.get());

        Supplier<Employee> emp = ()->{
            return new Employee(123,"Sam",56000);
        };

        System.out.println("Employee  :"+emp.get());



    }
}
