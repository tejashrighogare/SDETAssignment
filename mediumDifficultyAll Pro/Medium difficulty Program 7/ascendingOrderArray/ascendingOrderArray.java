package ascendingOrderArray;
public class ascendingOrderArray {
    /*
    Q7. Write a program to sort the array in ascending order without using collections.
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 9, 8, 7, 6, 5, 1, 2, 1};
        ascendingOrderArrayFunction(inputArray);
    }
    public static void ascendingOrderArrayFunction(int[] inputArrayElement) {
        for (int i = 0; i < inputArrayElement.length - 1; i++) {
            for (int j = i + 1; j < inputArrayElement.length; j++) {
                int max = 0;
                if (inputArrayElement[i] > inputArrayElement[j]) {
                    max = inputArrayElement[i];
                    inputArrayElement[i] = inputArrayElement[j];
                    inputArrayElement[j] = max;
                }
            }
        }
        int arrayElement = inputArrayElement.length;
        int j = 0;//for next element
        for (int i = 0; i < arrayElement - 1; i++) {
            if (inputArrayElement[i] != inputArrayElement[i + 1]) {
                inputArrayElement[j++] = inputArrayElement[i];
            }
        }
        inputArrayElement[j++] = inputArrayElement[arrayElement - 1];
        for (int i = 0; i < j; i++) {
            System.out.println(inputArrayElement[i]);
        }
    }
}

