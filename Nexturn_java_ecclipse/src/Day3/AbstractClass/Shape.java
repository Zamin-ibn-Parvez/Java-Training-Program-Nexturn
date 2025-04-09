package Day3.AbstractClass;

abstract public class Shape {
    protected final double PI = 3.14f;
    protected double length;
    protected double breadth;
    protected double radius;


    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Shape(double radius) {
        this.radius = radius;
    }

    abstract public void findArea();


}





