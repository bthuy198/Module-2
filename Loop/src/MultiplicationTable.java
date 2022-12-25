public class MultiplicationTable {
    public static void main(String[] args) {
//      in ra bảng cửu chương
//        tạo bảng
        System.out.println("           Multiplication Table");
//        table body
        System.out.print("       ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
//        bảng cửu chương
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d | ", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}