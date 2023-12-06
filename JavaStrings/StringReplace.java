public class StringReplace {
    // Input a string from the user. Create a new string called ‘result’ in which
    // you will replace the letter ‘e’ in the original string with letter ‘i’.
    // Example :
    // original = “eabcdef’ ; result = “iabcdif”
    // Original = “xyz” ; result = “xyz”
    public static void main(String[] args) {
        String name = "EngineerForever";
        String name2 = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                name2 = name2 + 'i';
            } else {
                name2 = name2 + name.charAt(i);
            }
        }
        System.out.print(name2);

    }
}
