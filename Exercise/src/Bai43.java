import java.util.Scanner;

public class Bai43 {
    public static void main(String[] args) {
//        Hãy đếm số lượng chữ số của số nguyên dương n
        Scanner scn = new Scanner(System.in);
        System.out.println("n = ");
        int number = scn.nextInt();
        System.out.println("số lượng chữ số của số nguyên dương n = " + countN(number));
    }

    public static int countN(int number) {
        int count = 0;
        for (int i = 1; i < number; i *= 10) {
            if (number / i > 0) {
                count++;
            } else break;
        }
        return count;
    }
}