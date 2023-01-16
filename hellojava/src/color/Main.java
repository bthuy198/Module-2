package color;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int max = 5;
        int[] sold = {2, 3, 4, 10, 13, 20};
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                arr[i][j] = i * max + j + 1;
                for (int k = 0; k < sold.length; k++) {
                    if (arr[i][j] == sold[k]) {
                        arr[i][j] = 0;
                        System.out.print(Color.RED + "0" + arr[i][j] + " " + Color.RESET);
                    }
                }
                if (arr[i][j] != 0) {
                    if (arr[i][j] < 10) {
                        System.out.print("0" + arr[i][j] + " ");
                    } else {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
