import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        StringBuilder s = new StringBuilder(sc.nextLine());
        for (int i = 0; i < s.length() / 2; i++) {
            int front = i;

            char frontChar = s.charAt(i);
            int back = s.length() - 1 - i;
            char backChar = s.charAt(back);
            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);

        }
        System.out.println(s);
    }
}
