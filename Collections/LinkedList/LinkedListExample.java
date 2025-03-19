package Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("java");
        ll.add("python");
        ll.add("Nexturn");
        System.out.println(ll);
        ll.addFirst("Zamin");
        ll.addLast("Oracle");
        ll.add(3, null);
        ll.addLast("Java");
        System.out.println(ll);


    }

}
