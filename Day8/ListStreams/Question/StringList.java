package Day8.ListStreams.Question;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StringList {

    public int count(ArrayList<String> list) {
        ArrayList<String> list2 = (ArrayList<String>) list.stream()
                .filter(s->s.length()>4)
                .collect(Collectors.toList());

        return list2.size();
    }

    public void ExtractStrings(ArrayList<String> list) {
        ArrayList<String> filteredList = (ArrayList<String>) list.stream()
                .filter(s->s.length()>4)
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }

    public void ConvertStringToUpperCase(ArrayList<String> list) {
        String joinedList =  list.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(joinedList);
    }

}
