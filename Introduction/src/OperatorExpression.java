import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Nhap chieu rong = ");
        width = scanner.nextFloat();
        System.out.println("Nhap chieu cao = ");
        height = scanner.nextFloat();
        System.out.println("S = " + width * height);
    }
}