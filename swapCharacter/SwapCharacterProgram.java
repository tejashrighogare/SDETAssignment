package swapCharacter;

public class SwapCharacterProgram {
    public static void main(String[] args) {
        String inputString = "ABCDEFGH";
        int swapCharacterStartIndex = 4;
        int swapNoOfTime = 3;
        swapCharacters(inputString, swapCharacterStartIndex, swapNoOfTime);
    }

    public static void swapCharacters(String inputString, int swapCharacterStartIndex, int swapNoOfTime) {
        int stringLength = inputString.length();
        swapNoOfTime = swapNoOfTime % stringLength;
        char[] character = inputString.toCharArray();
        for (int index = 0; index < swapCharacterStartIndex; index++) {
            char temporary = character[index];
            character[index] = character[(index + swapNoOfTime) % stringLength];
            character[(index + swapNoOfTime) % stringLength] = temporary;
            System.out.println("after " + index + " index swap " + String.valueOf(character));
        }
    }
}