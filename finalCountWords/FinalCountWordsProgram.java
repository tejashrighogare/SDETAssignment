package finalCountWords;

import java.util.HashMap;

public class FinalCountWordsProgram {
    //Write a Java Program to count the number of words in a string using HashMap.
    public static void main(String[] args) {
        String inputString = "This this is is done by Tejashri Tejashri";
        countTotalWords(inputString);
        inputString = "This is Java Program";
        countTotalWords(inputString);
    }

    public static void countTotalWords(String inputString) {
        String[] splitString = inputString.split(" ");
        HashMap<String, Integer> hashMapObject = new HashMap<String, Integer>();
        for (int count = 0; count < splitString.length; count++) {
            if (hashMapObject.containsKey(splitString[count])) {
                int index = hashMapObject.get(splitString[count]);
                hashMapObject.put(splitString[count], index + 1);
            } else {
                hashMapObject.put(splitString[count], 1);
            }
        }
        System.out.println(hashMapObject);
    }
}