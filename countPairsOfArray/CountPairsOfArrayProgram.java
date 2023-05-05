package countPairsOfArray;

public class CountPairsOfArrayProgram {
    // Java Program for Count pairs with given sum
    public static void main(String args[]) {
        int[] arrayElement = {1, 5, 7, -1, 6};
        int sumOfElements = 4;
        getPairsCount(arrayElement, sumOfElements);
       int [] arrayElementNew={1, 5, 7, -1, 5};
        sumOfElements = 6;
        getPairsCount(arrayElementNew, sumOfElements);
    }

    public static void getPairsCount(int[] inputArray, int sumOfElements) {
        int counter = 0;
        for (int count = 0; count < inputArray.length; count++) {
            for (int subCount = count + 1; subCount < inputArray.length; subCount++) {
                if ((inputArray[count] + inputArray[subCount]) == sumOfElements)
                    counter++;
            }
        }
        System.out.printf("Count of pairs is " + counter+"\n");
    }
}