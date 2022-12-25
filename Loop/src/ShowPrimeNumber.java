import java.util.Scanner;

public class ShowPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hiển thị bao nhiêu số nguyên tố");
        int number = scn.nextInt();
        showPrimeNumbers(number);
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
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void showPrimeNumbers(int number) {
        int count = 0;
        int i = 2;
        while (count < number) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}