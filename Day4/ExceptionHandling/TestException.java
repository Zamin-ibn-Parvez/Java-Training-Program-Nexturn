package Day4.ExceptionHandling;

import Day4.Functionalinterface.ExampleQuestion.ArithemeticOperations;

public class TestException {
    public static void main(String[] args) {
        int x = 7;
        int y =0;

        int arr[] = {1,2,3,4,5};

        try{
            int r = x/y;
            System.out.println("result :"+r);
            System.out.println("array value :"+arr[2]);
        }
        catch(ArithmeticException | IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("Program successfully executed");
    }
}
