import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the number to search");
        int x = sc.nextInt();
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                System.out.println("The index is " + i);
            }

        }

    }
}
