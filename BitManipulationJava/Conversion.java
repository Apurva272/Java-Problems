public class Conversion {
    public static void main(String[] args) {
        int n = 1367;
        int num = 11101;
        DecimalToBinary(n);
        BinaryToDecimal(num);

    }

    public static void DecimalToBinary(int n) {
        // String s = " ";
        StringBuilder str = new StringBuilder();

        while (n > 0) {
            int i = 0;
            int rem = n % 2;
            // s = s + rem;
            str.append(rem);
            n = n / 2;
            i++;
        }
        // System.out.println(str);

        System.out.println("The binary value is" + " " + str.reverse());
    }

    public static void BinaryToDecimal(int n) {
        int sum = 0;
        int count = 0;
        // int mul = 1;

        while (n != 0) {
            int rem = n % 10;
            int bitmask = 1 << count;
            int mul = rem * bitmask;
            sum = sum + mul;
            count++;
            n = n / 10;

        }
        System.out.println("The decimal value is" + " " + sum);

    }

}
