import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {


        System.out.println("Linear Equation Resolver ax + b = 0");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a = ");
        double a = Double.parseDouble(scn.nextLine());
        System.out.println("Enter b = ");
        double b = Double.parseDouble(scn.nextLine());

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %.2f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}