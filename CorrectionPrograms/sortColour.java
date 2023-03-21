package Occurances;

public class sortColour {
    static int length;

    public static void printArray(int[] array) {

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Output is:");
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 0, 2, 1, 1, 0};
        length = array.length;
        System.out.print("Input is:");
        printArray(array);
        sortArray(array);
    }
}