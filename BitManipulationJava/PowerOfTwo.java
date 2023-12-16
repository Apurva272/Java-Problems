public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 12;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println("Power of 2");
            } else {
                System.out.println("Not a power of 2");
            }

        }
    }

}
