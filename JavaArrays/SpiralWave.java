import java.util.Scanner;

public class SpiralWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0;
        int columnStart = 0;
        int rowEnd = rows;
        int columnEnd = col;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int cols = columnStart; cols < columnEnd; cols++) {
                System.out.print(arr[rowStart][cols] + " ");

            }
            rowStart++;
            for (int rowz = rowStart; rowz < rowEnd; rowz++) {
                System.out.print(arr[rowz][columnEnd - 1] + " ");

            }
            // rowStart++;
            columnEnd--;
            for (int cols = columnEnd; cols > columnStart; cols--) {
                System.out.print(arr[rowEnd - 1][cols - 1] + " ");
            }
            rowEnd--;
            for (int rowz = rowEnd; rowz > rowStart; rowz--) {
                System.out.print(arr[rowz - 1][columnStart] + " ");
            }
            columnStart++;
        }

    }
}
