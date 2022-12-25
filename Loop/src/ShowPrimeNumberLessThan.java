import java.util.Scanner;

public class ShowPrimeNumberLessThan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hiển thị số nguyên tố nhỏ hơn 100 ");
        System.out.print("2 ");
        int number = 3;
        while (number < 100){
            if(isPrime(number)){
                System.out.print(number + " ");
            }
            number++;
        }
    }
    public static int range(int number) {
        int range;
        if (number % 2 == 1) {
            number++;
        }
        return range = number / 2;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        }
        if (number == 2) {
            isPrime = true;
        }
        for (int i = 2; i <= range(number); i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}