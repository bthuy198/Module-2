import java.util.Scanner;

public class RemoveValueInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numberArray = {1, 5, 7, 6, 4, 9};
        System.out.println("Enter value to remove");
        int value = scn.nextInt();
        int position = exists(numberArray, value);
        if(position != -1){
            removeValue(numberArray, position);
            for(int i = 0; i < numberArray.length; i++){
                System.out.print(numberArray[i] + " ");
            }
        } else{
            System.out.println("This value doesn't exist in array");
        }
    }

    public static int exists(int[]array, int number){
        int position = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                position = i;
            }
        }
        return position;
    }

    public static int[] removeValue(int[] array, int position){
        for(int i = position; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[array.length - 1] = 0;
        return array;
    }
}
