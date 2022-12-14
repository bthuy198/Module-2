package shape;

public class TestResize {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle(2.0, 3.0);

        System.out.println("Before resize");
        System.out.println(circle1.toString());
        System.out.println(rect.toString());
        System.out.println(rect2.toString());

        //resize
        circle1.resize(10.0);
        rect.resize(10.0);

        System.out.println("After resize +10%");
        System.out.println(circle1.toString());
        System.out.println(rect.toString());
        System.out.println(rect2.toString());
    }
}
