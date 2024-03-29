package StringMergeAlternativly;

public class StringMergeAlternativly {
    /*
    Q4. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
     the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 */
    public static void main(String args[]) {
        String result = mergeStringAlternatively("abc", "xyz");
        System.out.println(result);
        result = mergeStringAlternatively("Hi", "There");
        System.out.println(result);
        result = mergeStringAlternatively("xxxx", "There");
        System.out.println(result);
    }

    public static String mergeStringAlternatively(String firstString, String secondString) {
        String mergeString = "";
        for (int counter = 0; counter < firstString.length() || counter < secondString.length(); counter++) {
            if (counter < firstString.length())
                mergeString += firstString.charAt(counter);
            if (counter < secondString.length())
                mergeString += secondString.charAt(counter);
        }
        return mergeString;
    }
}