import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Số tiền gửi");
        double money = scn.nextDouble();
        System.out.println("Tỉ lệ lãi suất theo năm");
        double rate_per_year = scn.nextDouble();
        System.out.println("Số tháng cho vay");
        int month = scn.nextInt();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * ((rate_per_year / 100) / 12) * month;
        }
        System.out.println("Số tiền lãi nhận được là: " + totalInterest);
    }
}