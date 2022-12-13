package shape;

public class TestResize {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Rectangle rect = new Rectangle();

        System.out.println("Before resize");
        System.out.println(circle1.toString());
        System.out.println(rect.toString());

        //resize
        circle1.resize(30.0);
        rect.resize(30.0);

        System.out.println("After resize +30%");
        System.out.println(circle1.toString());
        System.out.println(rect.toString());
    }
}
