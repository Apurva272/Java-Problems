import java.util.Scanner;

public class Stringlenth {
    // Take an array of Strings input from the user & find the cumulative (combined)
    // length of all those strings.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        String combined = "";
        String[] arr = new String[l];
        System.out.println("Enter array elemets");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < l; i++) {
            combined = combined + arr[i];
        }
        System.out.print("The length is" + " " + combined.length());

    }
}