package illegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("----Check triangle----");
        TriangleCheck triangleCheck = new TriangleCheck();
        try{
            System.out.println("Enter side 1: ");
            double a = Double.parseDouble(scn.nextLine());
            System.out.println("Enter side 2: ");
            double b = Double.parseDouble(scn.nextLine());
            System.out.println("Enter side 3: ");
            double c = Double.parseDouble(scn.nextLine());
            try{
                triangleCheck.checkTriangle(a,b,c);
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            }
        } catch (Exception e){
            System.err.println("Error: Incorrect format");
        }
        scn.close();
    }
}
