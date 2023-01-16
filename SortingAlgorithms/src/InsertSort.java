public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 8, 5, 1, 4, 99, 6, 15, 0, 3, 9, 13};
        int position;
        int x;
        for (int i = 1; i < arr.length; i++) {
            position = i;
            x = arr[i];
            while(position > 0 && x < arr[position - 1]){
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = x;
        }
        printArray(arr);
    }

    public static int[] InsertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    for (int k = i; k > 0; k--) {
                        if (arr[k] < arr[k - 1]) {
                            int temp2 = arr[k];
                            arr[k] = arr[k - 1];
                            arr[k - 1] = temp2;
                            break;
                        }
                    }
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
