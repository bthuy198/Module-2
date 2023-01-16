import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
//        Kiểm tra xem n có phải là số hoàn thiện hay không
//        Số hoàn hảo (hay còn gọi là số hoàn chỉnh, số hoàn thiện hoặc số hoàn thành) là
//        một số nguyên dương mà tổng các ước nguyên dương chính thức của nó
//        (số nguyên dương bị nó chia hết ngoại trừ nó) bằng chính nó.
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int number = scn.nextInt();
        System.out.println(number + " la so hoan hao? " + kiemTraSoHoanHao(number));
    }

    public static boolean kiemTraSoHoanHao(int number){
        int sum = 0;
        if(number == 0 || number == 1){
            return false;
        }
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            return true;
        }
        return false;
    }
}