package Occurances;
public class SortNumber {
    static int length;
    public static void printArray(int[] array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void sortArray(int[] array) {
        int temporary = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.print("Output is:");
        printArray(array);
    }
    //Write program for sort number
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 9, 3, 2};
        length = array.length;
        System.out.print("Input is:");
        printArray(array);
        sortArray(array);
    }
}