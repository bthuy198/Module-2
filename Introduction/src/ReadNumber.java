import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập vào số cần đọc");
            number = scn.nextInt();
        } while (number < 0 || number > 999);
        if (number < 10) {
            System.out.println(readOneNumber(number));
        } else if (number < 20) {
            System.out.println(readTwoNumbersLessThan20(number));
        } else if (number < 100 && number > 20) {
            System.out.println(readTwoNumbersMoreThan20(number));
        } else if (number >= 100) {
            System.out.println(readThreeNUmber(number));
        }

    }

    //    public static String read(int number){
//
//    }
    public static String readOneNumber(int number) {
        String read = "";
        switch (number) {
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "night";
                break;
            default:
                read = "";
                break;
        }
        return read;
    }

    public static String readTwoNumbersLessThan20(int number) {
        String read;
        int units = number - 10;
        if (units == 0) {
            read = "ten";
        } else read = readOneNumber(units) + " teen";
        return read;
    }

    public static String readTwoNumbersMoreThan20(int number) {
        int tens = number / 10;
        int units = number - tens * 10;
        String read;
        if (tens == 2) {
            read = "twenty" + readOneNumber(units);
            if (units == 0) {
                read = "twenty";
            }
        } else {
            read = readOneNumber(tens) + "ty " + readOneNumber(units);
            if (units == 0) {
                read = readOneNumber(tens) + "ty ";
            }
        }
        return read;
    }

    public static String readThreeNUmber(int number) {
        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10; //610
        int units = 100 * hundreds - 10 * tens;
        int tensUnits = tens * 10 + units;
        String read = "";
        if (tens == 1) {
            read = readOneNumber(hundreds) + " hundred and " + readTwoNumbersLessThan20(tensUnits);
        }
        if (tens == 2) {
            read = readOneNumber(hundreds) + " hundred and " + readTwoNumbersMoreThan20(tensUnits);
        }
        if (tens == 0) {
            if (units == 0) {
                read = readOneNumber(hundreds) + " hundreds";
            } else {
                read = readOneNumber(hundreds) + " hundred and " + readOneNumber(units);
            }
        }
        read = readOneNumber(hundreds) + " hundreds and " + readTwoNumbersMoreThan20(tensUnits);
        return read;
    }
}