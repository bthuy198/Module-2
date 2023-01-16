public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 8, 5, 1, 4, 99, 6, 15, 0, 3, 9, 13};
        selectionSort(arr);
        printArray(arr);
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (Integer number : array) {
            System.out.print(number + " ");
        }
    }
}
