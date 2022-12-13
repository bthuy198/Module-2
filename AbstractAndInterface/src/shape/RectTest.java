package shape;

import java.util.Arrays;

public class RectTest {
    public static void main(String[] args) {
        ComparableRect[] rectangles = new ComparableRect[3];
        rectangles[0] = new ComparableRect(2,3);
        rectangles[1] = new ComparableRect(1,3);
        rectangles[2] = new ComparableRect(2,4);

        System.out.println("Before sorted");
        for(ComparableRect rect : rectangles){
            System.out.println(rect);
        }

        Arrays.sort(rectangles);

        System.out.println("After sorted");
        for(ComparableRect rect : rectangles){
            System.out.println(rect);
        }
    }
}
