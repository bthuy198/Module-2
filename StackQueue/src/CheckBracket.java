import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String s = "s * (s – a) * (s – b) * (s – c)";
        String s2 ="(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String s3 ="s * (s – a) * (s – b * (s – c) ";
        String s4 = "s * (s – a) * s – b) * (s – c) ";
        String s5 = "– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ";
        String s6 = "()))(((";
        System.out.println(checkBracket(s));
        System.out.println(checkBracket(s2));
        System.out.println(checkBracket(s3));
        System.out.println(checkBracket(s4));
        System.out.println(checkBracket(s5));
        System.out.println(checkBracket(s6));
    }
    public static boolean checkBracket(String s){
        s = s.trim();
        final char LEFT_BRACKET = '(';
        final char RIGHT_BRACKET = ')';
        Stack<Character> stack = new Stack<>();
        int countLeft = 0;
        int countRight = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == LEFT_BRACKET){
                stack.push(s.charAt(i));
                countLeft++;
            }
            if(s.charAt(i) == RIGHT_BRACKET){
                if(stack.isEmpty()){
                    return false;
                }
                countRight++;
                if(countLeft < countRight){
                    return false;
                }
            }
        }
        if(countLeft == countRight){
            return true;
        }
        return false;
    }
}
