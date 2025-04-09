package Day4.Functionalinterface;

public interface Addition {
    int add(int x, int y);

    default void display() {
        System.out.println("This is a default method");
    }

    static void output(){
        System.out.println("This is a static method");
    }

}
