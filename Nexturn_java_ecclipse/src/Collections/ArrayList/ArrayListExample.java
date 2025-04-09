package Collections.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("java");
        list.add("Nexturn");
        list.add(56.55);
        list.add('k');
        list.add(null);
        System.out.println(list+ " "+ list.size());
        list.add(23);
        list.add(60);
        list.add(3,"Nicmar");
        System.out.println(list + " "+ list.size());
        list.remove("java");
//        list.remove(Integer.valueOf(10)); //Removes the value of 10 from the list as it is an object
        System.out.println(list + " "+ list.size());

        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            if(!(itr.next() instanceof Integer)){
                itr.remove();
            }

        }
        System.out.println(list + " "+ list.size());
    }
}
