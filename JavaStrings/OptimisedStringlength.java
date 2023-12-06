import java.util.Scanner;

public class OptimisedStringlength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        int totalLength = 0;
        String[] arr = new String[l];
        System.out.println("Enter array elemets");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.next();
            totalLength += arr[i].length();
        }
        System.out.print(totalLength);
    }
}
