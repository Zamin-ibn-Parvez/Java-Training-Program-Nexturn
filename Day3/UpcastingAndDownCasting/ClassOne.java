package Day3.UpcastingAndDownCasting;

public class ClassOne{

    public void display(){
        System.out.println("From super class");
    }


    public static void main(String[] args) {
        ClassOne one = new ClassOne();

        one = new ClassTwo(); //Upcasting

        one.display();
    }


}
