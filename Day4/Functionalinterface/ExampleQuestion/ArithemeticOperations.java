package Day4.Functionalinterface.ExampleQuestion;

public class ArithemeticOperations {

    public static void main(String[] args) {
        Multiply mult = (x,y)->{
            return x*y;
        };

        Division div = (x,y)->{
            if(y!=0){
                return x/y;
            }
            else{
                return -1;
            }

        };

        System.out.println(mult.multiply(7,8));
        System.out.println(div.division(7,8));
    }

}
