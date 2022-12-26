package circle;

public class Circle {
     private double radius;
     private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 2 * 3.14 * radius;
    }
}
