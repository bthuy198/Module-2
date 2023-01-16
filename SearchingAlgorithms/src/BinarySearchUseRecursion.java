import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUseRecursion {
        static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = enterArray();
        System.out.println("Before sort");
        printArray(numbers);
        Arrays.sort(numbers);
        System.out.println("After sort");
        printArray(numbers);
        System.out.println("Enter value you want to search");
        int value = Integer.parseInt(scn.nextLine());
        System.out.println("Value " + value + " at index = " + binarySearch(numbers, value, 0, numbers.length - 1));
    }
    public static int[] enterArray(){
        System.out.println("Enter size of array");
        int size = Integer.parseInt(scn.nextLine());
        int[] numbers = new int[size];
        int i = 0;
        do {
            System.out.println("Enter numbers at index = " + i);
            numbers[i] = Integer.parseInt(scn.nextLine());
            i++;
        } while (i != size);
        return numbers;
    }

    public static void printArray(int[] numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] numbers, int key, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (key == numbers[mid]) {
                return mid;
            }
            if (key > numbers[mid]) {
                return binarySearch(numbers, key, mid + 1, high);
            }
            return binarySearch(numbers, key, low, mid - 1);
        }
        return -1;
    }
}
