package stringMergeAlternativly;

public class stringMergeAlternativly {
    /*
    Q4. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
     the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 */
    public static void main(String args[]) {
        String result = mergeStringAlternatively("abc", "xyz");
        System.out.println(result);
    }

    public static String mergeStringAlternatively(String firstString, String secondString) {
        String mergeString = "";
        for (int i = 0; i < firstString.length() || i < secondString.length(); i++) {
            if (i < firstString.length())
                mergeString += firstString.charAt(i);

            if (i < secondString.length())
                mergeString += secondString.charAt(i);
        }
        return mergeString;
    }
}
