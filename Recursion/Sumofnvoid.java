public class Sumofnvoid {
    public static void PrintSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);

            return;
        }

        sum = sum + i;

        PrintSum(i + 1, n, sum);
        System.out.println(sum); // to understand stack removal of functions

    }

    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int sum = 0;
        PrintSum(i, n, sum);

    }
}
