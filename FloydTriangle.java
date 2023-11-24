public class FloydTriangle {
    public static void main(String args[]) {
        int k = 0;
        for (int i = 1; i <= 5; i++) {

            for (int j = k + 1; j <= k + i; j++) {
                System.out.print(j);

            }

            System.out.println();
            k = k + i;
        }
    }
}