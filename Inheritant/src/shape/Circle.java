package shape;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 2 * Math.PI * radius;
    }

    public double getPerimeter(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}

class CircleTest{
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1 = new Circle(5.5);
        System.out.println(circle1);
    }
}
