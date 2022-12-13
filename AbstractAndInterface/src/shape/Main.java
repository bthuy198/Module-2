package shape;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[5];
        circles[0] = new ComparableCircle(4.0);
        circles[1] = new ComparableCircle(5.5);
        circles[2] = new ComparableCircle(4.0);
        circles[3] = new ComparableCircle();
        circles[4] = new ComparableCircle(3.0);
        System.out.println("Before-sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}