package Day4.ExceptionHandling;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(){
        super("Employee details not found ...");
    }

}
