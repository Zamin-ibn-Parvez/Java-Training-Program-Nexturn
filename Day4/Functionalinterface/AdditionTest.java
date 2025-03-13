package Day4.Functionalinterface;

public class AdditionTest {
    public static void main(String[] args) {
        Addition addition = (x,y)->{
            return x+y;
        };

        System.out.println(addition.add(5,6));
        addition.display();
        Addition.output();

    }
}
