package swapPrimeNo;

import java.util.*;

public class SwapPrimeNo {
    /*
    Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
     If the last array value is prime no.
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 7};
        int[] inputArraySecond = {1, 2, 3};
        int[] inputArrayThird = {1, 6, 7, 9, 8};
        int lastNumber = inputArray[inputArray.length - 1];
        printResult(inputArray, lastNumber);
        lastNumber = inputArraySecond[inputArraySecond.length - 1];
        printResult(inputArraySecond, lastNumber);
        lastNumber = inputArrayThird[inputArrayThird.length - 1];
        printResult(inputArrayThird, lastNumber);
    }

    public static void printResult(int[] inputArray, int lastNumber) {
        if (swapPrimeNumber(lastNumber, 2) || lastNumber == 0 || lastNumber == 1) {
            System.out.println("Array last element is : " + lastNumber + " And Number is prime");
            int temporaryNumber = inputArray[0];
            inputArray[0] = lastNumber;
            inputArray[inputArray.length - 1] = temporaryNumber;
            System.out.println("new array is : " + Arrays.toString(inputArray));
        } else {
            System.out.println("Last number of array is : " + lastNumber + " is not prime so not swapped");
            System.out.println("new array is : " + Arrays.toString(inputArray));
        }
    }

    public static boolean swapPrimeNumber(int number, int counter) {
        if (number % counter == 0) {
            return false;
        }
        if (counter * counter > number) return true;
        return swapPrimeNumber(number, counter + 1);
    }
}