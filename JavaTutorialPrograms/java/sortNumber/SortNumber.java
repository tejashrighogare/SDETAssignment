package sortNumber;

public class SortNumber {
    //Write program for sort number
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 9, 3, 2};
        length = array.length;
        System.out.print("Input is:");
        printArray(array);
        sortArray(array);
    }

    static int length;

    public static void printArray(int[] array) {
        for (int counter = 0; counter < length; counter++) {
            System.out.print(array[counter] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        int temporaryVariable = 0;
        for (int counter = 0; counter < length; counter++) {
            for (int subCounter = counter + 1; subCounter < length; subCounter++) {
                if (array[counter] > array[subCounter]) {
                    temporaryVariable = array[counter];
                    array[counter] = array[subCounter];
                    array[subCounter] = temporaryVariable;
                }
            }
        }
        System.out.print("Output is:");
        printArray(array);
    }
}