import java.util.Scanner;

public class CountBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int count = 0;
        while (n != 0) {
            if ((1 & n) == 1) {
                count++;

            }
            n = n >> 1;
        }
        System.out.println("The number of 1s is" + " " + count);

    }
}
