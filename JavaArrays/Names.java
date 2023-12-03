import java.util.Scanner;

public class Names {
    // Take an array of names as input from the user and print them on the screen.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many names do you want to print?");
        int length = sc.nextInt();
        String[] arr = new String[length];
        System.out.println("Enter the names");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + "NAME IS " + arr[i]);
        }

    }

}
