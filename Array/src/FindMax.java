import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Size of array (under 20) = ");
        int size;
        int i = 0;
        do {
            size = scn.nextInt();
        } while (size > 20);
        int[] array = new int[size];
        while (i < array.length) {
            System.out.println("Enter value of array in " + (i + 1) + " position ");
            array[i] = scn.nextInt();
            i++;
        }
        System.out.println(findMax(array));
    }

    public static String findMax(int[] arr) {
        int max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                position = i + 1;
            }
        }
        return "The max value of array is " + max + ", at position = " + position;
    }
}
