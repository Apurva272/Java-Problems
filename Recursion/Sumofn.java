public class Sumofn {
    public static int naturalNum(int n) {
        if (n == 0)
            return 0;
        return n + naturalNum(n - 1);

    }

    public static void main(String[] args) {
        int n = 6; // print sum of first 5 natural numbers
        int sum = 0;
        sum = sum + naturalNum(n);
        System.out.println(sum);

    }
}
