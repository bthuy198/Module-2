import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh giai phuong trinh bac nhat co dang ax + b = c");
        double a, b, c;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("c = ");
        c = scanner.nextDouble();
        double x;
        if (a == 0) {
            if (b == c) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            x = (c - b) / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }

}