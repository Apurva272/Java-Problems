public class PowerOfn {
    // optimised with time complexity log n
    public static int powerofn(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0)
            return powerofn(x, n / 2) * powerofn(x, n / 2);
        if (n % 2 != 0)
            return powerofn(x, n / 2) * powerofn(x, n / 2) * x;
        return 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        int pow = powerofn(x, n);
        System.out.println(pow);

    }

}
