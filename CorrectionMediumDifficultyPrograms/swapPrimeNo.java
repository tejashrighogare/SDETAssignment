public class swapPrimeNo {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 7};
        SwapPrimeNumber(inputArray);
    }
    public static void SwapPrimeNumber(int[] inputArray) {
        for (int i = 0; i <= inputArray.length; i++) {
            int lastElement;
            lastElement = inputArray[inputArray.length - 1];
            if (lastElement % 2 != 0) {
                int temporary = 0;
                temporary = inputArray[i];
                inputArray[i] = inputArray[inputArray.length - 1];
                inputArray[inputArray.length - 1] = temporary;
            }
            for (i = 0; i < inputArray.length; i++)
                System.out.print(inputArray[i] + " ");
        }
    }
}


