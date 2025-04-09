package Day3.AbstractClass;

abstract class Test {
    protected int x;
    protected int y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void output(){
        System.out.println("This is a concrete method");
    }

    abstract void display();

}


public class TestAbstract extends Test{
    public TestAbstract(int x, int y) {
        super(x, y);
    }
    @Override
    void display(){
        System.out.println("This is an abstract method");
    }


    public static void main(String[] args) {
        TestAbstract test = new TestAbstract(10, 20);
        test.output();
        test.display();



    }
}
