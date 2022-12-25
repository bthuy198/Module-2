import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a name's student");
        String name = scn.nextLine();
        name = name.trim();
        System.out.println(findElement(name));
    }

    public static int findElement(String name){
        String[] students = {"Tom", "John", "Jenny", "Tiffany"};
        int index = -1;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(name)){
                index = i;
            }
        }
        return index;
    }
}
