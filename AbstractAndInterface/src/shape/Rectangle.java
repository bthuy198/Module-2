package shape;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;

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

    public double getPerimeter() {
        return (width + height) * 2;
    }
    public double getArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "A rectangle has area = " + getArea() + ", perimeter = "+getPerimeter();
    }

    @Override
    public void resize(double percent) {
        width = width + width * (percent / 100);
        height = height + height * (percent / 100);
    }
}
