public class fibonacci {
    public static void main(String[] args) {
        int sum0 = 0;
        int sum1 = 1;
        int sum;
        int n = 7;
        System.out.print(sum0 + " " + sum1 + " ");
        for (int i = 3; i <= n; i++) {
            sum = sum0 + sum1;
            sum0 = sum1;
            sum1 = sum;

            System.out.print(+sum + " ");
        }

    }
}
