package swapPrimeNo;

public class swapPrimeNo {
    /*
    Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
     If the last array value is prime no.
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 7};
        SwapPrimeNumber(inputArray);
    }
    public static void SwapPrimeNumber(int[] inputArray) {
        int lastElement = inputArray[inputArray.length - 1];
            if (lastElement % 2 != 0) {
                int temporary = 0;
                temporary = inputArray[0];
                inputArray[0] = inputArray[inputArray.length - 1];
                inputArray[inputArray.length - 1] = temporary;
            }
            for (int i = 0; i < inputArray.length; i++)
                System.out.print(inputArray[i] + " ");
        }
    }



