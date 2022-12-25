public class SumValueOfCol {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Sum of column %d of matrix is %d", i + 1, calcSumOfCol(arr, i));
            System.out.println();
        }
    }

    public static int calcSumOfCol(int[][] array, int column) {
        int row = array.length;
        int col = array[0].length;
        int sum = 0;
        for (int i = 0; i < col; i++) {
            sum += array[i][column];
        }
        return sum;
    }
}
