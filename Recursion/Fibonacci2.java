public class Fibonacci2 {

    public static int fibonacci(int a1, int a2, int n, int count) {
        if (n - 2 == count) {
            return 0;
        }

        int sum = a1 + a2;
        System.out.print(sum + " ");

        fibonacci(a2, sum, n, count + 1);

        return sum;

    }

    public static void main(String[] args) {
        int a1 = 0;
        int count = 0;
        int a2 = 1;
        int n = 5;
        System.out.print(a1 + " ");
        System.out.print(a2 + " ");
        fibonacci(a1, a2, n, count);

        // ystem.out.print(a1 + " " + a2 + " " + fibonacci(a1, a2, n - 2, count) + " ");
    }
}
