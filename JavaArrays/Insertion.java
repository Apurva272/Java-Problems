public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 0, 0 };

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = current; // Adding this line for the placement of current when it is lesser than arr[j]
                j--;

            }

            arr[j + 1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
