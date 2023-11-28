import java.util.Scanner;

public class TableFunction {
    public static void Table(int n) {
        int table;
        for (int i = 1; i <= 10; i++) {
            table = n * i;
            System.out.println(n + "x" + i + "=" + table);

        }
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Table(n);

    }
}
