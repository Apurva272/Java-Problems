public class PowerOfTwoBitwise {
    public static void main(String[] args) {
        int n = 1025;
        int count = 0;
        int pos = 1;
        while (n > 1) {
            int bitmask = 1 << pos;

            if ((bitmask & n) != 0) {

                count++;
            }
            n = n << pos;
        }
        if (count == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }

    }
}
