package Day3.AbstractClass;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius);
    }



    public void findArea(){

        double area = PI * radius * radius;
        System.out.println("The area of the circle is :"+area);

    }

    public static void main(String[] args) {
        Circle circle = new Circle(1.2);
        circle.findArea();
    }


}
