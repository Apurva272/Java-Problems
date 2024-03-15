//Find the first and last occurence of an element in a string
package Strings;

public class FirstAndLast {

    public static void main(String[] args) {
        String s = "samosasa";
        char a = 's';
        int index = 0;
        int first = -1;
        int last = -1;
        while (index < s.length()) {
            if (s.charAt(index) == a) {
                if (first == -1) {
                    first = index;
                } else {
                    last = index;
                }
            }
            index++;
        }
        System.out.println(first);
        System.out.println(last);

    }
}
