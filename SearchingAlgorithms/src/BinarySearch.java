import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    static int[] numbers = {0, 2, 5, 6, 7, 8, 9, 11, 23, 45, 67, 99};

    static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key == numbers[mid]) {
                return mid;
            } else if (key < numbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(numbers, 11));
        System.out.println(binarySearch(numbers, 99));
        System.out.println(binarySearch(numbers, 15));
        System.out.println(binarySearch(numbers, 2));
        System.out.println(binarySearch(numbers, 0));
        System.out.println(binarySearch(numbers, 23));
    }
}
