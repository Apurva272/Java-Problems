import java.util.Scanner;

public class SumFunction {
    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int calculatedSum = Sum(num1, num2);
        System.out.print(calculatedSum);
    }
}