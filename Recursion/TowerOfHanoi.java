//Time complexity is O(2^n-1)
// Divide n rings into two parts ring nth = 1 ring, ring n-1 to 1 = 2nd ring.
    // Now think of them as 2 rings and solve
public class TowerOfHanoi {
    public static void Tower(int n, String source, String destination, String helper) {
        if (n == 1) {
            System.out.println("Transfer of " + n + " from " + source + " to " + destination);
            return;
        }
        Tower(n - 1, source, helper, destination);
        System.out.println("Transfer of " + n + " from " + source + " to " + destination);
        Tower(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        int n = 3;
        Tower(n, "S", "D", "H");
    }
}
