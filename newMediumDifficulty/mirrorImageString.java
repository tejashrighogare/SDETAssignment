public class mirrorImageString {
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