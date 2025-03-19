package Collections.ArrayList;

import java.util.ArrayList;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        String searchElement = "apple";
        if(list.contains(searchElement)){
            System.out.println(searchElement + " is present in the list at index " + list.indexOf(searchElement));
        }
        else{
            System.out.println("The search element is not present in the list");
        }

    }
}
