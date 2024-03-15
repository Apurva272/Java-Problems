public class StringReverse {
    public static void StringRev(String s, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(s.charAt(index));
        StringRev(s, index - 1);
    }

    public static void main(String[] args) {
        String s = "abcd";
        int index = s.length() - 1;
        StringRev(s, index);

    }
}
