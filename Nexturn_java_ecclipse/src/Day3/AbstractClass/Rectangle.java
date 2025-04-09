package Day3.AbstractClass;

public class Rectangle extends Shape {


    public Rectangle(double length , double breadth){
        super(length,breadth);
    }

    public void findArea(){
        double area = length*breadth;
        System.out.println("The area of the rectangle is : "+area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1.2,6.8);
        rectangle.findArea();
    }

}
