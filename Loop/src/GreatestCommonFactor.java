import java.util.Scanner;

public class GreatestCommonFactor {
//    public static void main(String[] args) {
//        int a, b;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao so a: ");
//        a = scanner.nextInt();
//        System.out.println("Nhap vao so b: ");
//        b = scanner.nextInt();
//        a = Math.abs(a);
//        b = Math.abs(b);
//        int uocChungMax = 0;
//        if (a == 0 || b == 0) {
//            System.out.println(a + "va" + b + "khong co UCLN");
//        }
//        while (a != b) {
//            if (a > b)
//                a = a - b;
//            else
//                b = b - a;
//        }
//        System.out.println("UCLN la " + a);
//    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("number 1 = ");
        int number1 = scn.nextInt();
        System.out.println("number 2 = ");
        int number2 = scn.nextInt();
        System.out.println("Greatest common factor of number1 and number 2 is " + findGCF(number1,number2));
    }

//    ucln = greatest common factor = gcf
    public static int findGCF(int number1,int number2){
        int min = number1 < number2 ? number1 : number2;
        int gcf = 0;
        for(int i = 1; i <= min; i++){
            if(number1 % i == 0 && number2 % i == 0){
                gcf = i;
            }
        }
        return gcf;
    }
}