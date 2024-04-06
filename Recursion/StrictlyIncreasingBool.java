//Check if a sorted array is strictly increasing or Not
public class StrictlyIncreasingBool {
    public static boolean CheckArray(int[] arr, int i) {

        if (i == arr.length - 1) {

            return true;
        }

        if (arr[i] >= arr[i + 1]) {
            return false;

        }
        return CheckArray(arr, i + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4 };
        int i = 0;
        System.out.println(CheckArray(arr, i));
    }
}
