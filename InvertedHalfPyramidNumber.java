public class InvertedHalfPyramidNumber {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int k = i - 1;
            for (int j = 1; j <= n - k; j++) {
                System.out.print(j);

            }

            System.out.println();
        }
    }
}
