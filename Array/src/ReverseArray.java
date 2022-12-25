import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài mảng");
        int size = scn.nextInt();
        while (size > 20) {
            System.out.println("Chiều dài mảng không quá 20");
        }
        int array[] = randomArray(size);
        displayArray(array);
        reverseArray(array);
        System.out.println("after reverse array");
        displayArray(array);
    }

    public static int[] randomArray(int size) {
        int max = 50;
        int min = 0;
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        return numberArray;
    }

    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
