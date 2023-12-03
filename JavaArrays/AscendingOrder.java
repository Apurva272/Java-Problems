import java.util.Scanner;

public class AscendingOrder {
    // Take an array of numbers as input and check if it is an array sorted in
    // ascending order.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter the length");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < l; i++) {
            if (arr[i] > arr[i - 1]) {
                c++;
            }

        }
        if (c == l - 1) {
            System.out.println("The array is in Ascending order");
        } else {
            System.out.println("The array is NOT in Ascending order");

        }

    }
}
