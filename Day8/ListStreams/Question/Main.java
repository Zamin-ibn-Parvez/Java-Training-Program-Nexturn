package Day8.ListStreams.Question;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");
        list.add("");
        list.add("");
        StringList StringList = new StringList(); ///counts number of values in string list > 4
        int value = StringList.count(list);
        System.out.println("Strings with more than 4 characters: " + value);
        EmptyStrings Empty = new EmptyStrings();
        int value2 = Empty.countEmpty(list);  //counts number of empty strings
        System.out.println("Number of empty strings: " + value2);
        Empty.RemoveEmptyStrings(list);   //removes empty strings and prints the remaining strings
        StringList.ExtractStrings(list);  //Extracts all the strings with length > 4
        StringList.ConvertStringToUpperCase(list); //Converts all the strings to uppercase and joins them using commas

        ArrayList<Integer> Integerlist = new ArrayList<Integer>();
        Integerlist.add(10);
        Integerlist.add(10);
        Integerlist.add(20);
        Integerlist.add(30);
        Integerlist.add(40);


        CreateAListOfSquaresOfDistinctNumbers ListOfSquares = new CreateAListOfSquaresOfDistinctNumbers();
        ArrayList<Integer> list3 = ListOfSquares.CreateAListOfSquaresOfDistinctNumbers(Integerlist);  //Returns a list of squares of distinct numbers
        System.out.println(list3);

        System.out.println("sum by using Stream : " + Integerlist.stream().mapToInt(Integer::intValue).sum());

        System.out.println("count by using Stream: " + Integerlist.stream().count());

        System.out.println("average by using Stream : " + Integerlist.stream().mapToInt(Integer::intValue).average());

        System.out.println("Max by using Stream : " + Integerlist.stream().mapToInt(Integer::intValue).max());

        System.out.println("Min by using Stream : " + Integerlist.stream().mapToInt(Integer::intValue).min());

    }
}
