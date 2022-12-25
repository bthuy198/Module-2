import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng (kg)");
        double weight = scn.nextDouble();
        System.out.println("Nhập vào chiều cao (m)");
        double heigth = scn.nextDouble();
        double bmi = weight / Math.pow(heigth, 2);
        System.out.println(showBodyInterpretation(bmi));
    }

    public static String showBodyInterpretation(double bmi){
        String status;
        if(bmi < 18.5){
            return status = "Underweight";
        } else if(bmi < 25.0){
            return status = "Normal";
        } else if(bmi < 30){
            return status = "Overweight";
        } else{
            return status = "Obese";
        }
    }
}