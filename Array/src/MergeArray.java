public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 8, 9, 10};
        int[] array2 = {2, 5, 7, 8, 9, 20};
//        int[] arrayMerge = mergeArray(array1, array2);
        displayArray(mergeArray(array1, array2));
    }

    public static int[] mergeArray(int[]arr1,int[]arr2){
        int[] arrayMerge = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            arrayMerge[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            arrayMerge[i + arr1.length] = arr2[i];
        }
        return arrayMerge;
    }
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
