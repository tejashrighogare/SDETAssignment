package revString;
public class revString {
    /*
    Q6. Write a program to reverse the string without changing the position of special character.
 */
    public static void main(String[] args) {

        String result = Reverse("Ro@hitshetty");
        System.out.println(result);
    }
    static String Reverse(String inputString) {
        String result = "";
        String specialCharatcterList = "@,#,$";
        for (int cntr = 0; cntr < inputString.length(); cntr++) {
            char reverseChar = inputString.charAt(inputString.length() - (cntr + 1));

            if (specialCharatcterList.contains(Character.toString(reverseChar)))
                continue;
            String currentCharacter = Character.toString(inputString.charAt(cntr));
            if (specialCharatcterList.contains(currentCharacter)) {
                reverseChar = inputString.charAt(cntr);
            }
            result += reverseChar;
        }
        return result;
    }
}
