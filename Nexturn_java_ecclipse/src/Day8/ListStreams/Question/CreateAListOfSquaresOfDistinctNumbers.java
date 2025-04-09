package Day8.ListStreams.Question;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CreateAListOfSquaresOfDistinctNumbers {

    public ArrayList<Integer> CreateAListOfSquaresOfDistinctNumbers(ArrayList<Integer> Integerlist) {
        ArrayList<Integer> list2 = (ArrayList<Integer>) Integerlist.stream()
                .distinct()
                .map(i -> i * i)
                .collect(Collectors.toList());
        return list2;
    }
}
