package Collections.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ConvertArraytoList {



    public static void main(String[] args) {
        //Convert array to arraylist
        String[] array = {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);


    }
}

