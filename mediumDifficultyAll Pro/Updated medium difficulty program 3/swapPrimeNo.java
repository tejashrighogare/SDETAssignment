package swapPrimeNo;

import java.util.*;

public class swapPrimeNo {
    /*
    Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
     If the last array value is prime no.
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 7};
        int[] inputArraySecond={1, 2, 3};
        int[] inputArrayThird={1, 6, 7, 9, 8};
        SwapPrimeNumber(inputArray);
        SwapPrimeNumber(inputArraySecond);
        SwapPrimeNumber(inputArrayThird);
    }
    public static void SwapPrimeNumber(int[] inputArray) {
        int lastElement = inputArray[inputArray.length - 1];
            if (lastElement % 2 != 0) {
                int temporary = 0;
                temporary = inputArray[0];
                inputArray[0] = inputArray[inputArray.length - 1];
                inputArray[inputArray.length - 1] = temporary;
            }
        System.out.println(Arrays.toString(inputArray));
        }
    }



