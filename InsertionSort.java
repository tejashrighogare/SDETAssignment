import java.util.*;

public class InsertionSort {
    void insertionSort(int array[]) {
        int arraySize = array.length;
        for (int index = 1; index < arraySize; index++) {
            int keyValue = array[index];
            int subIndex = index - 1;
            while (subIndex >= 0 && keyValue < array[subIndex]) {
                array[subIndex + 1] = array[subIndex];
                --subIndex;
            }
            array[subIndex + 1] = keyValue;
        }
    }

    public static void main(String args[]) {
        int[] inputArray = {9, 5, 1, 4, 3};
        InsertionSort elements = new InsertionSort();
        elements.insertionSort(inputArray);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(inputArray));
    }
}