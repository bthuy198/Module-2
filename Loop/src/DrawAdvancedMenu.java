import java.util.Scanner;

public class DrawAdvancedMenu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        render menu
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int choice = scn.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                drawTriangle();
                break;
            case 3:
                drawIsosceles();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("You didn't choice");
        }
    }

    //    draw square triangle
    public static void drawTriangle() {
//        top-left
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");
//        top-right
        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");
//        bottom-left
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");
//        bottom-right
        for (int i = 0; i < 5; i++) {
            for (int k = 1; k < 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void drawIsosceles() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}