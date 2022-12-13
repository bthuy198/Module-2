package shape;

public class Circle extends Shape implements Resizeable {
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

    public double getArea() {
        return 2 * Math.PI * radius;
    }

    public double getPerimeter() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cirlce with radius = " + radius + " area = "+ getArea() +", perimeter = " +  getPerimeter() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        radius = radius + radius * (percent / 100);
    }
}


