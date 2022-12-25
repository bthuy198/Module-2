public class SumDiagonalsOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(sumDiagonalsOfMatrix(arr));
    }

    public static int sumDiagonalsOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int j = matrix.length - 1 - i;
            sum += matrix[i][j];
            sum+= matrix[i][i];
        }
        return sum;
    }
}
