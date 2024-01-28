public class IncreasePrint {
    public static void Increasenum(int n) {

        if (n > 5) {
            return;
        }
        System.out.println(n);
        Increasenum(n + 1);

    }

    public static void main(String args[]) {
        int n = 1;
        Increasenum(n);

    }
}
