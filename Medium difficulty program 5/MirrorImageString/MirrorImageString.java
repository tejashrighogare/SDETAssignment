package MirrorImageString;

public class MirrorImageString {
    /*
    Q5. Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    In other words, zero or more characters at the very begining of the given string, and at the very end of the string
    in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
 */
    public static void main(String args[]) {
        mirrorImageStringOutput("abXYZba");
        mirrorImageStringOutput("abca");
        mirrorImageStringOutput("aba");
    }

    public static void mirrorImageStringOutput(String inputString) {
        String mirrorImageStringOut = "";
        for (int counter = 0; counter < inputString.length() / 2; counter++) {
            if (inputString.charAt(counter) == inputString.charAt(inputString.length() - 1 - counter)) {
                mirrorImageStringOut += inputString.charAt(counter);
            }
        }
        System.out.println(mirrorImageStringOut);
    }
}