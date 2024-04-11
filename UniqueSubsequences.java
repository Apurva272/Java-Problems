import java.util.HashSet;

//print all the unique subsequences of string. Time complexity = O(2^n)
public class UniqueSubsequences {
    public static void uniquesubsequences(String s, int i, String newS, HashSet<String> set) {
        if (i == s.length()) {
            if (set.contains(newS)) {
                return;
            } else {
                System.out.println(newS);
                set.add(newS);
                return;
            }
        }
        char curr = s.charAt(i);
        uniquesubsequences(s, i + 1, newS + curr, set);
        uniquesubsequences(s, i + 1, newS, set);
    }

    public static void main(String[] args) {
        String s = "aaa";
        int i = 0;
        String newS = "";
        HashSet<String> set = new HashSet<>();
        uniquesubsequences(s, i, newS, set);

    }
}
