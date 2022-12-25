public class FindMin {
    public static void main(String[] args) {
        int[] numberArray = {1, 4, 5, 7, 9, 3, 0};
        System.out.println("Min value of array is " + findMin(numberArray));
    }

    public static int findMin(int [] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
