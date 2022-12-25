import java.util.Scanner;

public class CountStudentsPass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter student numbers");
        int size;
        do {
            size = scn.nextInt();
        } while (size > 30);
        double[] markOfStudent = new double[size];
        System.out.println("Enter mark");
        int i= 0;
        do {
            markOfStudent[i] = scn.nextDouble();
            i++;
        } while (i < markOfStudent.length);
        int count = countStudentPass(markOfStudent);
        System.out.printf("It has %d student(s) passed", count);
    }
    public static int countStudentPass(double [] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 5.0){
                count++;
            }
        }
        return count;
    }
}
