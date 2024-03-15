package Strings;

public class StringReverse {
    public static void main(String[] args) {
        String s = "abc";
        int index = s.length() - 1;
        while (index >= 0) {
            System.out.print(s.charAt(index));
            index--;
        }
    }
}
