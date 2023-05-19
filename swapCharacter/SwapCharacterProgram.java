package swapCharacter;

public class SwapCharacterProgram {
    public static void main(String[] args) {
        String inputString = "ABCDEFGH";
        int swapCounter = 4;
        int characterCounter = 3;
        swapCharacters(inputString, swapCounter, characterCounter);
    }

    public static void swapCharacters(String inputString, int swapCounter, int characterCounter) {
        int stringLength = inputString.length();
        characterCounter = characterCounter % stringLength;
        char[] character = inputString.toCharArray();
        for (int index = 0; index < swapCounter; index++) {
            char temporary = character[index];
            character[index] = character[(index + characterCounter) % stringLength];
            character[(index + characterCounter) % stringLength] = temporary;
            System.out.println("after " + index + " index swap " + String.valueOf(character));
        }
    }
}