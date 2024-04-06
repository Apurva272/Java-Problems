public class RemoveDuplicates {
    // In a string, remove all the duplicate characters
    public static void RemoveDupe(String s, int index, String newS) {
        if (index == s.length()) {
            System.out.println(newS);
            return;
        }
        char curr = s.charAt(index);
        if (newS.indexOf(curr) == -1) {
            newS += curr;
        }
        RemoveDupe(s, index + 1, newS);
    }

    public static void main(String[] args) {
        String s = "abbcscda";
        int index = 0;
        String newS = "";
        RemoveDupe(s, index, newS);
    }
}