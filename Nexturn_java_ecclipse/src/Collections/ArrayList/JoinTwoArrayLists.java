package Collections.ArrayList;

import java.util.ArrayList;

public class JoinTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list1.addAll(list2);  //here this code snippet is joining the arraylist list1 and list2
        System.out.println(list1);

    }
}
