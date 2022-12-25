import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Nhập $ = ");
        double dollar = scn.nextDouble();
        System.out.println("VNĐ = "+ (int) (rate * dollar));
    }
}