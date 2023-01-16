public class InsertSortByStep {
    public static void main(String[] args) {
        int[] arr = {12, 22, 58, 65, 81, 40, 99, 16, 15, 90, 33, 79, 13};
        System.out.println("Before sort processing...");
        printArray(arr);
        System.out.println("----------------------------------------");
        insertSort(arr);
    }

    public static int[] insertSort(int[] arr) {
        int position, x;
        boolean printArray = false;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            position = i;
            while (position > 0 && x < arr[position - 1]) {
                arr[position] = arr[position - 1];
                position--;
                printArray = true;
            }
            arr[position] = x;
            if (printArray) {
                if (i == arr.length - 1) {
                    System.out.println("After sort processing...");
                    printArray(arr);
                } else {
                    printArray(arr);
                    System.out.println("----------------------------------------");
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (Integer number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
