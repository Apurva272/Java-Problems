public class Factorial {
    public static int Fact(int n) {
        // int fact = 1;
        if (n == 0) {
            return 1;
        }
        return n * Fact(n - 1);

    }

    public static void main(String[] args) {
        int n = 6;
        int x = Fact(n);
        System.out.println(x);
    }
}
