public class Arraycopy {
    public static void main(String[] args) {
        int array1[] = {1,2,4};
        int array2[] = {9,3,5};
//        array2 = array1;
//        array2[2] = 10;
//        System.out.println(displayArray(array2));
//        System.out.println(displayArray(array1));
        int array3[] = new int[6];
        System.arraycopy(array1,0,array3, 0, 3);
        System.arraycopy(array2, 0, array3, 3, 3);
        System.out.println(displayArray(array3));
    }

    public static String displayArray(int[] arr){
        String str = "{ ";
        for (int i = 0; i < arr.length; i++){
            str += arr[i] + " ";
        }
        str += "}";
        return str;
    }
}
