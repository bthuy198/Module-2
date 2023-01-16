import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxConsecutiveIncreasingly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        // Tìm chuỗi liên tiếp có độ dài lớn nhất
        for(int i = 0; i < string.length(); i++){
            if(list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        System.out.println("Chuỗi liên tiếp có độ dài nhất: ");
        //Hiển thị chuỗi vừa tìm kiếm
        for(Character ch : max){
            System.out.print(ch);
        }
    }
}
