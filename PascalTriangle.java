public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                int fact1 = factorial(i);
                int fact2 = factorial(i - j);
                int fact3 = factorial(j);
                int fact4 = fact2 * fact3;
                System.out.print(fact1 / fact4 + " ");

            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;

        }
        return fact;
    }

}
