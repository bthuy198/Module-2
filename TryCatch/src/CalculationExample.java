import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("x = ");
        int x = Integer.parseInt(scn.nextLine());
        System.out.println("y = ");
        int y = Integer.parseInt(scn.nextLine());
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("a + b = " + a);
            System.out.println("a - b = " + b);
            System.out.println("a * b = " + c);
            System.out.println("a / b = " + d);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
