import java.util.Scanner;

public class AddValueInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 11;
        numbers[3] = 20;
        System.out.println("Enter the position of value");
        int position;
        do{
            position = scn.nextInt();
        } while((position - 1) < 0 || position > numbers.length);
        int index = position - 1;
        System.out.println("Enter value to add");
        int value = scn.nextInt();
        int[] newArray = addValue(numbers, index, value);
        displayArray(newArray);
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
