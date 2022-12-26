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
        double percent = 20.0;
        circle1.resize(percent);
        rect.resize(percent);

        System.out.println("After resize " +  percent);
        System.out.println(circle1.toString());
        System.out.println(rect.toString());
        System.out.println(rect2.toString());
    }
}
