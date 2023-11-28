public class GCD {
    public static void main(String[] args) {
        int a = 2;
        int greatest = Integer.MAX_VALUE;
        int div = 1;
        int b = 4;
        for (int i = 1; i <= 6; i++) {
            if (a % i == 0 && b % i == 0) {

                div = i;
            }
            if (div > i) {
                greatest = div;
            }

        }
        System.out.print(greatest);
    }
}
