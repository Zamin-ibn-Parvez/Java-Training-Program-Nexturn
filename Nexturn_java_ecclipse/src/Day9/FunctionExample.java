package Day9;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Function functional interface
        //String to integer
        Function<String , Integer> strToInt = s -> Integer.valueOf(s);
        System.out.println("stringToInt = "+ strToInt.apply("567"));
        int s1 =  strToInt.apply("100");
        System.out.println(s1+50);

        //sq. root value

        Function<Integer, Double> sqrt = sq -> Math.sqrt(sq);
        System.out.println("sqrt = "+ sqrt.apply(25));



    }
}
