package MirrorImageString;
public class MirrorImageString {
    /*
    Q5. Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    In other words, zero or more characters at the very begining of the given string, and at the very end of the string
    in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
 */
    public static void main(String args[]) {
        String result = mirrorImageStringOutput("abXYZba");
        System.out.println(result);
    }
    public static String mirrorImageStringOutput(String inputString) {
        String mirrorImageStringOut = "";
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) == inputString.charAt(inputString.length() - 1 - i)) {
                mirrorImageStringOut += inputString.charAt(i);
            }
        }
        return mirrorImageStringOut;
    }
}