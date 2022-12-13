package shape;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new ComparableCircle(4.0);
        circles[1] = new ComparableCircle(5.5);
        circles[2] = new ComparableCircle(4.0);
        circles[3] = new ComparableCircle(1.0);
        System.out.println("Before-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
