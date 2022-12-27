import java.util.Scanner;
import java.util.Stack;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scn.nextInt();
        System.out.println(changeBinary(number));
    }

    public static String changeBinary(int number) {
        String binary = "";
        Stack<Integer> changeBinary = new Stack<>();
        int numberStack;
        while (number / 2 != 0) {
            numberStack = number % 2;
            changeBinary.push(numberStack);
            number = number / 2;
        }
        changeBinary.push(number);
        while (!changeBinary.isEmpty()) {
            binary += changeBinary.pop();
        }
        return binary;
    }
}
