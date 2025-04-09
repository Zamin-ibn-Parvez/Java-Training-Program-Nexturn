package Day3.UpcastingAndDownCasting;

public class ClassTwo extends ClassOne{

    public void display(){

        System.out.println("From sub class");
    }

    void show(){
        System.out.println("This is a method of a sub class only");
    }

    public static void main(String[] args) {
        ClassTwo two = new ClassTwo();
        two.display();
        two.show();

        two = (ClassTwo) new ClassOne(); //Downcasting is not possible in Java

        two.display(); //This will also throw the error as this is trying to access the display method of the super class...
    }

}
