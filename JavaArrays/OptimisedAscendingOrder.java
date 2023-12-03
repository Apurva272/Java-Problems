import java.util.Scanner;

public class OptimisedAscendingOrder {
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
        boolean ascending = true;
        for (int i = 0; i < l - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
        }
        if (ascending) {
            System.out.println("Ascending order");
        } else {
            System.out.println("Not ascending");
        }
    }
}
