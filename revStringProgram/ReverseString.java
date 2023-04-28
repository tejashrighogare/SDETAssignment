package revStringProgram;

public class ReverseString {
    //Write a java program for reverse Words in a String
    public static void main(String[] args) {
        String stringName = "Hello Java World";
        String result = reverseWords(stringName);
        System.out.println("reverse string is " + result);
    }

    public static String reverseWords(String stringVariable) {
        String[] totalWords = stringVariable.split(" ");
        StringBuilder stringBuilderObject = new StringBuilder();
        int stringEnd = totalWords.length - 1;
        for (int count = 0; count <= stringEnd; count++) {
            if (!totalWords[count].isEmpty()) {
                stringBuilderObject.insert(0, totalWords[count]);
                if (count < stringEnd) stringBuilderObject.insert(0, " ");
            }
        }
        return stringBuilderObject.toString();
    }
}