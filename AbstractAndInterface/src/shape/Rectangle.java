package shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle has area = " + getArea();
    }
}
