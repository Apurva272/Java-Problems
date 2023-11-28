import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the exponent");
        int x = sc.nextInt();
        System.out.print(powercalc(n, x));
        double a = 5;
        double b = 3;
        double powerr = Math.pow(a, b);
        System.out.println("Testing Math Pow func" + " " + powerr);

    }

    public static long powercalc(int n, int x) {
        long powerofnum = 1;
        for (int i = 1; i <= x; i++) {
            powerofnum = powerofnum * n;

        }
        return powerofnum;

    }
}
