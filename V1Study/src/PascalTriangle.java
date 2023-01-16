public class PascalTriangle {
    public static void main(String[] args) {
        int h = 7;
        for (int i = 1; i <= h; i++) {
            for (int j = h - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + k);
            }
            for(int l = i - 1; l > 0 && l < h ;l--){
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
}