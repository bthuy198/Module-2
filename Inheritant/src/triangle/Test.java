package triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//    kiểm tra lớp shape
        Shape shape = new Shape();
        System.out.println(shape.toString());
        Shape shape2 = new Shape("violet");
        System.out.println(shape2.toString());

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println(triangle1);
    }
}
