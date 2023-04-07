package swapPrimeNo;

import java.util.*;

public class SwapPrimeNo {
    private int temporary;
    private int lastNumber;
    boolean flag = false;

    /*
    Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
     If the last array value is prime no.
     */
    public static void main(String[] args) {
        SwapPrimeNo swapObject = new SwapPrimeNo();
        int[] inputArray = {1, 2, 3, 7};
        int[] inputArraySecond = {1, 2, 3};
        int[] inputArrayThird = {1, 6, 7, 9, 8};
        swapObject.swapPrimeNumber(inputArray);
        swapObject.swapPrimeNumber(inputArraySecond);
        swapObject.swapPrimeNumber(inputArrayThird);
    }

    public void swapPrimeNumber(int inputArray[]) {
        lastNumber = inputArray[inputArray.length - 1];
        int midNumber = lastNumber / 2;
        for (int counter = 2; counter <= midNumber; counter++) {
            if (lastNumber % counter == 0) {
                flag = true;
                break;
            }
        }
        if (flag == true || lastNumber == 0 || lastNumber == 1) {
            System.out.println("Last number of array is : " + lastNumber + " is not prime so not swaped");
            System.out.println("new array is : " + Arrays.toString(inputArray));
        }
        else {
            System.out.println("Array last element is : " + lastNumber + " And Number is prime");
            temporary = inputArray[0];
            inputArray[0] = lastNumber;
            inputArray[inputArray.length - 1] = temporary;
            System.out.println("new array is : " + Arrays.toString(inputArray));
        }
    }
}