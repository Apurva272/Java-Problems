public class StrictlyIncreasing {
    public static void CheckArray(int[] arr, int i) {

        if (i == arr.length) {
            System.out.println("Strictly increasing array");
            return;

        }

        if (arr[arr.length - i] > arr[(arr.length - i) - 1]) {
            CheckArray(arr, i + 1);

        } else {
            System.out.println("Not a strictly increasing array");

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 9 };
        int i = 1;
        CheckArray(arr, i);
    }
}
