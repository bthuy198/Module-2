import java.util.Stack;

public class ReverseInStack {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 8, 6, 5};
        Stack<Integer> stack = reverseArray(numbers);
        System.out.println(stack);
        String str = "pattern";
        System.out.println(reverseString(str));
    }

    public static Stack<Integer> reverseArray(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int i = numbers.length; i > 0; i--) {
            stack.push(numbers[i - 1]);
        }
        return stack;
    }

    public static String reverseString(String str) {
        str = str.trim();
        Stack<String> wStack = new Stack<>();
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            String value = String.valueOf(str.charAt(i));
            wStack.push(value);
            reverseString += wStack.pop();
        }
        return reverseString;
    }
}
