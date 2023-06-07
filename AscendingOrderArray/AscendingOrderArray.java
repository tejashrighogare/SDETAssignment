package AscendingOrderArray;

import java.util.*;

public class AscendingOrderArray {
    /*
    Q7. Write a program to sort the array in ascending order without using collections.
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 9, 8, 7, 6, 5, 1, 2, 1};
        ascendingOrderArrayFunction(inputArray);
    }

    public static void ascendingOrderArrayFunction(int[] inputArrayElement) {
        for (int counter = 0; counter < inputArrayElement.length - 1; counter++) {
            for (int subCounter = counter + 1; subCounter < inputArrayElement.length; subCounter++) {
                int maximum = 0;
                String tempResult = "";
                if (inputArrayElement[counter] > inputArrayElement[subCounter]) {
                    maximum = inputArrayElement[counter];
                    inputArrayElement[counter] = inputArrayElement[subCounter];
                    inputArrayElement[subCounter] = maximum;
                }
            }
        }
        int AscendingArrayElement = inputArrayElement.length;
        int Temporary = 0;
        String tempResult = "";
        for (int newCounter = 0; newCounter < AscendingArrayElement - 1; newCounter++) {
            if (inputArrayElement[newCounter] != inputArrayElement[newCounter + 1]) {
                inputArrayElement[Temporary++] = inputArrayElement[newCounter];
                tempResult += inputArrayElement[newCounter] + " ";
            }
        }
        inputArrayElement[Temporary++] = inputArrayElement[AscendingArrayElement - 1];
        tempResult += inputArrayElement[AscendingArrayElement - 1];
        String[] array = tempResult.split(" ");
        System.out.println(Arrays.toString(array));
    }
}