import java.util.Scanner;

public class ShowName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name here");
        String name = scn.nextLine();
        System.out.println("Hello: " + name);
    }
}