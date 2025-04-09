package Day3.Interfaces;

public class TestInterface implements Interface1, Interface4{

    public void methodOne() {
        System.out.println("This is method one");
    }

    public void methodTwo() {
        System.out.println("This is method two ");
    }

    public void methodThree(){
        System.out.println("This is method 3");
    }

    public void method4(){
        System.out.println("This is method 4");
    }


    public static void main(String[] args) {

        TestInterface testInterface = new TestInterface();
        testInterface.methodOne();
        testInterface.methodTwo();
        testInterface.methodThree();
        testInterface.method4();
    }
}
