package swapCharacter;

public class SwapCharacterProgram {
    public static void main(String[] args) {
        String inputString = "ABCDEFGH";
        int swapNumber = 4;
        int count = 3;
        swapCharacters(inputString, swapNumber, count);
    }

    public static void swapCharacters(String inputString, int swapNumber, int count) {
        int stringLength = inputString.length();
        count = count % stringLength;
        char[] character = inputString.toCharArray();
        for (int index = 0; index < swapNumber; index++) {
            char temporary = character[index];
            character[index] = character[(index + count) % stringLength];
            character[(index + count) % stringLength] = temporary;
            System.out.println("after " + index + " index swap " + String.valueOf(character));
        }
    }
}