package Collections.ArrayList;

import java.util.ArrayList;

public class CopyOneArrayListToAnother {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        ArrayList<String> list2 = new ArrayList<String>(list);  //here this code snippet is copying the arraylist list  in another arraylist list2
        System.out.println(list2);
        System.out.println(list);
    }

}
