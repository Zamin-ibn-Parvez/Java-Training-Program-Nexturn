package Collections.Question;

import Collections.ArrayList.EmployeeOperations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmployeeOperations empOps = new EmployeeOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee code: ");
                    int code = sc.nextInt();
                    System.out.print("Enter employee name: ");
                    String name = sc.next();
                    System.out.print("Enter employee salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(code, name, salary);
                    empOps.createEmployee(emp);
                    break;
                case 2:
                    System.out.print("Enter employee code to search: ");
                    int searchCode = sc.nextInt();
                    Employee searchedEmp = empOps.searchEmployee(searchCode);
                    if (searchedEmp != null) {
                        System.out.println("Employee found: " + searchedEmp.getName() + ", " + searchedEmp.getSalary());
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    empOps.displayEmployees();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
