package Day8.ListStreams.Question;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmptyStrings {

    public int countEmpty(ArrayList<String> list) {
        ArrayList<String> list2 = (ArrayList<String>) list.stream()
                .filter(s -> s.length() == 0)
                .collect(Collectors.toList());
        return list2.size();
    }

    public void RemoveEmptyStrings (ArrayList<String> list) {
        ArrayList<String> list2 = (ArrayList<String>) list.stream()
                .filter(s ->!s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}

