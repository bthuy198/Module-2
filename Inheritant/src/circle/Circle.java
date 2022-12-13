package circle;

public class Circle{
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Khoi tao 2 tham so cua LOP CHA");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle radius =  " + radius + " color = " + color + " area = " + getArea();
    }
}

class TestCircle{
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0, "white");


        System.out.println(circle1);
        System.out.println(circle2);
    }
}
