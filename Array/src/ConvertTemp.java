import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("0.Exit");
        System.out.println("Please choose one");
        int choice = scn.nextInt();
        double fahrenheit;
        double celcius;
        switch (choice){
            case 1:
                System.out.println("Please enter fahrenheit degree");
                fahrenheit = scn.nextDouble();
                System.out.println("Fahrenheit to Celcius: " + fahrenheitToCelcius(fahrenheit));
                break;
            case 2:
                System.out.println("Please enter celcius degree");
                celcius = scn.nextDouble();
                System.out.println("Celcius to Fahrenheit: " + celciusToFahrenheit(celcius));
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("You didn't choose anything so the program will exit");
                break;
        }

    }

    public static double celciusToFahrenheit(double celcius){
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit){
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
