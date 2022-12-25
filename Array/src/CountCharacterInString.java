public class CountCharacterInString {
    public static void main(String[] args) {
        String str = "aaabcdefghiklmn";
        char letter = 'a';
        int count = countLetter(str, letter);
        System.out.printf("It has %d letter(s) '%s'  in string", count, letter);
    }

    public static int countLetter(String str, char letter){
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}
