//Print the keypad combinations (subsequences of a mobile phone)

public class KeypadCombinations {
    public static String[] map = { ".", "abc", "def", "ghi", "jkl", "mnop", "qrs", "tu", "vwx", "yz" };

    public static void Combinations(String s, int i, String combination) {
        if (i == s.length()) {
            System.out.println(combination);
            return;
        }
        char curr = s.charAt(i);
        String mapping = map[curr - 'a'];
        for (int ind = 0; ind < mapping.length(); ind++) {
            Combinations(s, i + 1, combination + mapping.charAt(ind));
        }

    }

    public static void main(String[] args) {
        String s = "23";
        String combination = "";
        int i = 0;
        Combinations(s, i, combination);

    }
}