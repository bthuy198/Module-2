import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
//        Tính tổng tất cả các ước số chẵn của số nguyên dương n
        Scanner scn = new Scanner(System.in);
        System.out.println("number = ");
        int number = scn.nextInt();
        System.out.println("tổng tất cả các ước số chẵn của number là " + tinhTongUocChan(number));
    }

    public static int tinhTongUocChan(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0 && i %2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}