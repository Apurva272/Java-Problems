// In a string, move all 'x' to the end
public class MoveX {
    public static void Moveallx(String s, int i, int count, String newStr) {
        if (i == s.length()) {
            for (int j = 1; j <= count; j++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char Currentchar = s.charAt(i);
        if (Currentchar == 'x') {
            count++;
            Moveallx(s, i + 1, count, newStr);
        } else {
            newStr += Currentchar;
            Moveallx(s, i + 1, count, newStr);
        }

    }

    public static void main(String[] args) {
        String s = "abcdxefghxijklx";
        int i = 0;
        String newStr = "";
        int count = 0;
        Moveallx(s, i, count, newStr);
    }
}
