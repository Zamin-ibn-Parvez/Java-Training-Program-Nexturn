package Collections.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> items = new HashMap<Integer,String>();
        items.put(1, "apple");
        items.put(2, "banana");
        items.put(3, "cherry");
        System.out.println(items);
        System.out.println(items.get(2));

        Set<Entry<Integer, String>> entries = items.entrySet();  //Returns the base address of the map as a set of entries. This set is backed by the map, so changes to the map are reflected in the set, and vice versa.
        Iterator <Entry<Integer, String>> itr = entries.iterator();

        while(itr.hasNext()){
            Entry<Integer,String > entry = itr.next(); //Returns the next element in the iteration>
            System.out.println("key : "+ entry.getKey()+ " "+ "Value : " + entry.getValue());
        }
    }
}

