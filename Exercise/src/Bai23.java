import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
//        Đếm số lượng ước số của số nguyên dương n
        Scanner scn = new Scanner(System.in);
        System.out.println("number = ");
        int number = scn.nextInt();
        System.out.println("Số lượng ước số của number = " + demUocSo(number));
    }

    public static int demUocSo(int number){
        int count =0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        return count;
    }
}