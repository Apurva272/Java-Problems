public class Maxmin {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.print(" " + arr[i]);
        }
        for (int i = 0; i < 5; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        System.out.println("The minimum number is" + " " + min);
        System.out.println("The maximum number is" + " " + max);
    }
}
