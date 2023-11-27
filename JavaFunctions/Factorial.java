import java.util.Scanner;

public class Factorial {
    public static long factorial(long n) {
        if (n < 0)
            return 0;

        long fact = 1;
        for (long i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = sc.nextLong();
        System.out.print(factorial(number));
    }
}
