public class FirstandLast {
    public static int first = -1;
    public static int last = -1;

    public static void PrintFirstandLast(String s, char ch, int index) {
        if (index == s.length()) {
            System.out.println(first);
            System.out.println(last);
        }

        if (s.charAt(index) == ch) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        PrintFirstandLast(s, ch, index + 1);
    }

    public static void main(String[] args) {
        String s = "abcddcba";
        char ch = 'c';
        // int index = 0;
        PrintFirstandLast(s, ch, 0);

    }
}
