package v1studybai1;

import java.util.Scanner;

public class SoHoc {
    Scanner scn = new Scanner(System.in);
    private int number1;
    private int number2;

    public SoHoc() {
    }

    public SoHoc(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void inputInfo(){
        this.number1 = scn.nextInt();
        this.number2 = scn.nextInt();
    }

    public void printInfo(){
        System.out.printf("number1 = %d, number2 = %d", number1, number2);
    }

    public int addition(){
        return this.number1 + this.number2;
    }

    public int subtract(){
        return this.number1 - this.number2;
    }

    public int multi(){
        return this.number1 * this.number2;
    }

    public int division(){
        return this.number1 / this.number2;
    }
}
class Test{
    public static void main(String[] args) {
        SoHoc number = new SoHoc();
        number.inputInfo();
        System.out.println(number.getNumber1());
        System.out.println(number.getNumber2());
        System.out.println(number.addition());
        System.out.println(number.subtract());
    }
}