package Collections.Set;

import java.util.HashSet;

public class HashsetExample {
    public static void main(String[] args) {
        HashSet items = new HashSet();
        items.add("apple");
        items.add(10);
        items.add('k');
        items.add(null);
        items.add(10);
        System.out.println(items);
    }
}
