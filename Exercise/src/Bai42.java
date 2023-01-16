import java.util.Scanner;

public class Bai42 {
    public static void main(String[] args) {
//        Cho n là số nguyên dương. Hãy tìm giá trị nguyên dương k lớn nhất sao cho S(k)  < n.
//        Trong đó chuỗi k được định nghĩa như sau: S(k) = 1 + 2 + 3 + … + k
        Scanner scn = new Scanner(System.in);
        System.out.println("n = ");
        int number = scn.nextInt();
        int k = 1;
        int sum = 0;
        for(int i = 1; sum + i < number; i++){
            sum += i;
            k = i;
        }
        System.out.println("giá trị nguyên dương k lớn nhất sao cho S(k)  < n la k = " + k);
    }
}