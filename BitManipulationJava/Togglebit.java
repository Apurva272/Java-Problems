import java.util.Scanner;

public class Togglebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println("Enter your bit position"); // for example if you want to change bit number 3, you should
                                                       // enter 2

        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        if ((n & bitmask) == 0) {
            n = n | bitmask;
            System.out.println("The toggled number is" + " " + n);
        } else {
            bitmask = ~bitmask;
            n = n & bitmask;
            System.out.println("The toggled number is" + " " + n);
        }
    }
}
