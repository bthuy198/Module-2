public class Demo {
    public static void main(String[] args) {
        int[] numberArray = {1, 3, 5, 7, 9, 0, 1, 6};
        int[] arrayNew = addValue(numberArray, 5, 3);
        displayArray(arrayNew);

    }

    public static int[] removeValue(int[] array, int position) {
        for (int i = position; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    public static int[] addValue(int[] arr, int index, int value) {
        int[] arrayNew = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            arrayNew[i] = arr[i];
        }
        arrayNew[index] = value;
        for (int i = index + 1; i < arrayNew.length; i++) {
            arrayNew[i] = arr[i - 1];
        }
        return arrayNew;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
