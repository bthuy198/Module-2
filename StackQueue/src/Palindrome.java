import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abaa";
        String s2 = "civic";
        System.out.println(s + " is palindrome? " + isPalindrome(s));
        System.out.println(s2 + " is palindrome? " + isPalindrome(s2));
    }

    public static boolean isPalindrome(String str) {
        str = str.trim().toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }
        int size = stack.size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (stack.pop().equals(queue.poll())) {
                count++;
            }
        }
        if (count == size) {
            return true;
        }
        return false;
    }
}
