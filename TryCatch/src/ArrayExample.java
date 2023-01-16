import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] numbers = arrayExample.createArrayRandom();

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter index = ");
        int index = Integer.parseInt(scn.nextLine());
        try {
            // {3,4,5}
            System.out.println("At index = " + index + ", value = " + numbers[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public int[] createArrayRandom() {
        Random random = new Random();
        int[] numbers = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return numbers;
    }
}
