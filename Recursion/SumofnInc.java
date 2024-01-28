public class SumofnInc {
    public static int naturalNum(int n, int lim) {
        if (n > lim)
            return 0;
        return n + naturalNum(n + 1, lim);

    }

    public static void main(String[] args) {
        int n = 1;
        int limit = 5; // print sum of first 5 natural numbers
        int sum = 0;
        sum = sum + naturalNum(n, limit);
        System.out.println(sum);

    }
}
