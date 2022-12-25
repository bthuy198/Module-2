import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào số năm cần kiểm tra");
        int year = scn.nextInt();
//        if (year % 100 == 0) {
//            if (year % 400 == 0) {
//                System.out.println(year + " là năm nhuận");
//            }
//            else{
//                System.out.println(year + " là năm không nhuận");
//            }
//        } else if (year % 4 == 0) {
//            System.out.println(year + " là năm nhuận");
//        } else {
//            System.out.println(year + " là năm không nhuận");
//        }
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d là năm nhuận", year);
        } else{
            System.out.println(year + " là năm không nhuận");
        }
    }
}