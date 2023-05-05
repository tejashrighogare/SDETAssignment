package rotateArray;

public class RotateArrayProgram {
    public static void main(String[] args) {
        //Given an integer array nums, rotate the array to the right by number steps, where number is non-negative.
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int number = 3;
        rotateArray(inputArray, number);
    }

    public static void rotateArray(int[] inputArray, int number) {
        System.out.println("Original array: ");
        for (int counter = 0; counter < inputArray.length; counter++) {
            System.out.print(inputArray[counter] + " ");
        }
        for (int counter = 0; counter < number; counter++) {
            int subCounter, lastIndexValue;
            lastIndexValue = inputArray[inputArray.length - 1];
            for (subCounter = inputArray.length - 1; subCounter > 0; subCounter--) {
                inputArray[subCounter] = inputArray[subCounter - 1];
            }
            inputArray[0] = lastIndexValue;
        }
        System.out.println();
        System.out.println("Array after right rotation: ");
        for (int counter = 0; counter < inputArray.length; counter++) {
            System.out.print(inputArray[counter] + " ");
        }
    }
}