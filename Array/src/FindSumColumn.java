import java.sql.Array;

public class FindSumColumn {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum3 = 0;
        int sumacross = 0;
        int sumacross2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || i == arr.length - 1){

            }
//            if (i == 0 || i == arr.length - 1) {
//                for (int j = 0; j < arr[i].length; j++) {
//                    sum3 += arr[i][j];
//                }
//            } else{
//                sum3 += arr[i][0] + arr[i][arr.length -1];
//            }
        }
        System.out.println(sum3);
//       tính tổng của đường chéo t1 của matrix
//        for (int i = 0; i < arr.length; i++) {
//            sumacross += arr[i][i];
//        }
//        System.out.println(sumacross);
//        tổng của đuờng chéo t2
//
//    tính tổng của cột thứ nhất của matrix
//        for(int col = 0; col < arr[0].length; col++){
//            int sum = 0;
//            for(int row = 0; row < arr.length; row++){
//                sum += arr[row][col];
//            }
//                System.out.println("Hàng " + (col + 1) + " của ma trận có tổng là " + sum);
//        }

    }
}