public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 8, 5, 1, 4, 6, 15, 0, 3, 9, 13};
        bubbleSort(arr);
        printArray(arr);
    }
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
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
