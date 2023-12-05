import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns");
        int b = sc.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[b][a];
        System.out.println("Enter the elements");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr2[j][i] = arr1[i][j];
                // System.out.print(arr2[j][i]);
            }

        }
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                System.out.print(arr2[j][i] + " ");
            }
            System.out.println();
        }

    }

}
