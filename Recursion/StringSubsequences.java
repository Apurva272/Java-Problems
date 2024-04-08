public class StringSubsequences {
    public static void Subsequences(String s, int i, String newS) {

        if (i == s.length()) {
            System.err.println(newS);
            return;
        }
        char curr = s.charAt(i);
        // choice 1: the character is to be added in newstring
        Subsequences(s, i + 1, newS + curr);
        // choice 2: The character is not added in newstring
        Subsequences(s, i + 1, newS);
    }

    public static void main(String[] args) {
        String s = "anna";
        int i = 0;
        String newS = "";
        Subsequences(s, i, newS);
    }
}
