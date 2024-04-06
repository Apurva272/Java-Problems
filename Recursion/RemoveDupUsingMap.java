public class RemoveDupUsingMap {
    public static boolean[] map = new boolean[26];

    public static void RemoveDupe(String s, int index, String newS) {
        char curr = s.charAt(index);
        if (index == s.length() - 1) {
            System.out.println(newS);
            return;
        }
        if (map[curr - 'a'] == true) {
            RemoveDupe(s, index + 1, newS);
        } else {
            newS += curr;
            map[curr - 'a'] = true;
            RemoveDupe(s, index + 1, newS);
        }
    }

    public static void main(String[] args) {
        String s = "abbcda";
        int index = 0;
        String newS = "";
        RemoveDupe(s, index, newS);
    }
}