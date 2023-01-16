package color;

public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int max = 5;
        String[] seat = {"A4", "A5", "A2"};
        int[] sold = {2, 3, 4, 10};
        int ch = 65;
        for (int i = 0; i < max; i++) {
            char abc = (char) ch;
            System.out.print(abc + "  ");
            for (int j = 0; j < max; j++) {
                arr[i][j] = j + 1;
                for (int k = 0; k < sold.length; k++) {
                    if (arr[i][j] == sold[k]) {
                        System.out.print(Color.RED + arr[i][j] + " " + Color.RESET);
                        arr[i][j] = 0;
                    }
                }
                if (arr[i][j] != 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
            ch++;
        }
    }
}
