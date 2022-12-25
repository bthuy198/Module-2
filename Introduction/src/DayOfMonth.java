import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int month;
        do {
        System.out.println("Nhập vào tháng cần kiểm tra (<12)");
        month = scn.nextInt();
        } while (month > 12);
        System.out.printf("Tháng %d có %s", month, countDays(month));
    }

    public static String countDays(int month){
        String days;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return days = "31 ngày";
            case 2:
                return days = "28 hoặc 29 ngày";
            default:
                return days = "30 ngày";
        }
    }
}