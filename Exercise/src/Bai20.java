import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
//      Tìm ucln của 2 số
        Scanner scn = new Scanner(System.in);
        System.out.println("number 1 = ");
        int number1 = scn.nextInt();
        System.out.println("number 2 = ");
        int number2 = scn.nextInt();
        System.out.println("UCLN là: " + timUCLN(number1,number2));
    }

    public static int timUCLN(int number1, int number2){
        int min = number1 > number2 ? number2 : number1;
        int max = 0;
        for(int i = 1; i <= min; i++ ){
            if(number1%i == 0 && number2%i ==0){
                max = i;
            }
        }
        return max;
    }
}