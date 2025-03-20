package Collections.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDiary {

    public ArrayList<Long> getList(HashMap<Long, String> phoneDiary, String name) {
        ArrayList<Long> list = new ArrayList<Long>();

        for (Map.Entry<Long, String> entry : phoneDiary.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(name)) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

        public static void main (String[] args){
            HashMap<Long, String> phoneDiary = new HashMap<Long, String>();
            phoneDiary.put(1234567890L, "John Doe");
            phoneDiary.put(9876543210L, "Carmine");
            phoneDiary.put(8779600033L, "Carmine");
            phoneDiary.put(5555555555L, "Bob Smith");

            PhoneDiary pd = new PhoneDiary();
            ArrayList<Long> list = pd.getList(phoneDiary, "John Doe");
            System.out.println(list);

        }
    }

