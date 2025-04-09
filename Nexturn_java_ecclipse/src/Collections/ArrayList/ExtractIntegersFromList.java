package Collections.ArrayList;

import java.util.ArrayList;

public class ExtractIntegersFromList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(67);
        list.add(12);
        list.add(23);
        list.add(34);

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for(Integer i : list){
            if(i%2==0){
                evenNumbers.add(i);
            }
        }

        System.out.println(evenNumbers);



    }
}
