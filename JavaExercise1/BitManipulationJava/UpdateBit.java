import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the boolean Value");
        boolean operation = sc.nextBoolean();
        int n = 5;
        int pos = 1;
        if (operation) {
            int bitmask = 1 << pos;
            int res = bitmask | n;
            System.out.println(res);
        } else {
            int bitmask2 = ~(1 << pos);
            int res2 = bitmask2 & n;
            System.out.println(res2);

        }

        // int operation = 1; // SET BIT
        /*
         * switch (operation) {
         * case 1:
         * int bitmask = 1 << pos;
         * int res = bitmask | n;
         * System.out.println(res);
         * break;
         * case 0:
         * int bitmask2 = ~(1 << pos);
         * int res2 = bitmask2 & n;
         * System.out.println(res2);
         * break;
         * default:
         * System.out.println("Incorrect");
         */

    }

}
