import java.util.Scanner;

public class PowerOfTwoOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int bitmask = n >> 1;
        if ((bitmask & n - 1) == bitmask) {
            System.out.println("Power of 2");

        } else {
            System.out.println("Not a power of 2");
        }
    }

}
