import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row of matrix");
        int row = scn.nextInt();
        System.out.println("Enter column of matrix");
        int col = scn.nextInt();
        double[][] matrix = new double[row][col];
        int rowPos;
        int colPos;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Value of matrix in position (%d, %d) ", i, j);
                matrix[i][j] = scn.nextDouble();
            }
        }
        double[] result = findMax(matrix);
        System.out.printf("The max value of array is %.2f at position (%.0f, %.0f)", result[0], result[1], result[2]);
    }

    public static double[] findMax(double[][] matrix) {
        double max = matrix[0][0];
        double[] result = new double[3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    result[0] = matrix[i][j];
                    result[1] = i;
                    result[2] = j;
                }
            }
        }
        return result;
    }
}
