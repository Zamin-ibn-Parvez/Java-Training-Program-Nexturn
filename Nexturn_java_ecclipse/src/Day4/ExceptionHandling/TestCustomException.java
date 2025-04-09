package Day4.ExceptionHandling;

public class TestCustomException {


    public static void main(String[] args) {
        int empCode = 101;
        String empName = "Nexturn";

        try{
            if(empCode!=101){
                throw new EmployeeNotFoundException();
            }
            System.out.println("Employee found with these details : "+empCode + " "+ empName);
        }

        catch(EmployeeNotFoundException e){
            e.printStackTrace();
        }
    }


}
