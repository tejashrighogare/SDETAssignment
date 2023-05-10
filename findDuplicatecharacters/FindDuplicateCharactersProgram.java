package findDuplicatecharacters;

import java.util.*;
public class FindDuplicateCharactersProgram {
  //Write a Java program that prints the duplicate characters from the string with its count
    public static void main(String[] args) {
        String inputString = "My name is Tejashri Ghogare!";
        printDuplicates(inputString);
    }
    public static void printDuplicates(String inputString) {
        int counter = 0;
        ArrayList<Character> characterList = new ArrayList<>();
        for (int count = 0; count < inputString.length(); count++) {
            char getCharacter = inputString.charAt(count);
            for (int subCount = 0; subCount < inputString.length(); subCount++) {
                if (inputString.charAt(subCount) != getCharacter) {
                    continue;
                }
                counter++;
            }
            if (!characterList.contains(getCharacter)) {
                if (counter > 1 && getCharacter != ' ') {
                    System.out.println("Char: " + getCharacter + ", Count: " + counter + " times.");
                    characterList.add(getCharacter);
                }
            }
            counter = 0;
        }
    }
}