import java.util.Scanner;

public class ClassifyingIntegers {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0, count3 = 0;

        // Write a program to enter the numbers till the user wants and at the end it
        // should display the count of positive, negative and zeros entered.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to insert?");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number");
            int num = sc.nextInt();

            if (num > 0) {
                count1++;
            } else if (num == 0) {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("count of positive numbers" + " " + count1);
        System.out.println("count of zeroes" + " " + count2);
        System.out.println("count of negative numbers" + " " + count3);
    }
}
