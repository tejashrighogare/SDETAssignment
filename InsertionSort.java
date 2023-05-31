import java.util.*;

/**
 * Write a Java program for insertion sort
 */
public class InsertionSort {
    public void insertionSort(int inputArray[]) {
        int arraySize = inputArray.length;
        for (int index = 1; index < arraySize; index++) {
            int arrayIndexValue = inputArray[index];
            int subIndex = index - 1;
            while (subIndex >= 0 && arrayIndexValue < inputArray[subIndex]) {
                inputArray[subIndex + 1] = inputArray[subIndex];
                --subIndex;
            }
            inputArray[subIndex + 1] = arrayIndexValue;
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