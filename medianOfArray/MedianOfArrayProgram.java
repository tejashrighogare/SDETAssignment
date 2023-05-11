package medianOfArray;

import java.util.*;

public class MedianOfArrayProgram {
    //Write Java Program to find Median of Sorted Array
    public static void main(String[] args) {
        int[] inputArray = {9, -5, 6, 12, 15, 2};
        Arrays.sort(inputArray);
        System.out.print("Median = " + calculateMedian(inputArray));
    }

    public static int calculateMedian(int[] inputArray) {
        int arrayLength = inputArray.length;
        if (arrayLength % 2 == 0) {
            int middleNumber = arrayLength / 2;
            int middleArrayNum = inputArray[middleNumber];
            int previousNumber = inputArray[middleNumber - 1];

            int MedianNumber = (middleArrayNum + previousNumber) / 2;
            return MedianNumber;
        } else {
            int MedianNumber = Math.round(arrayLength / 2);
            return inputArray[MedianNumber];
        }
    }
}