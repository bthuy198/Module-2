import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("n = ");
        int number = scn.nextInt();
        System.out.println(number + " is prime number? " + isPrime(number));
    }

    //    tim number / 2
    public static int sqrtNum(int number) {
        return (int)Math.sqrt(number);
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= sqrtNum(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if(number == 0 || number == 1){
            return false;
        }
        if(number == 2){
            return true;
        }
        if (count == 0) {
            return true;
        } else return false;
    }
}