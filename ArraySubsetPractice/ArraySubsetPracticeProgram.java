package ArraySubsetPractice;

import java.util.*;

public class ArraySubsetPracticeProgram {
    public static void main(String[] args) {
        int[] arrayInput = {1, 2, 3};
        int[] arrayInputElement = {0};
        List<List<Integer>> result;
        result = arraySubsets(arrayInput);
        System.out.println(result);
        result = arraySubsets(arrayInputElement);
        System.out.println(result);
    }

    public static List<List<Integer>> arraySubsets(int[] arrayInput) {
        List<List<Integer>> arraylistObject = new ArrayList<>();
        arraylistObject.add(new ArrayList<>());
        for (int inputArrayElement : arrayInput) {
            int arraylistSize = arraylistObject.size();
            for (int count = 0; count < arraylistSize; count++) {
                List<Integer> internalElements = new ArrayList<>(arraylistObject.get(count));
                internalElements.add(inputArrayElement);

                arraylistObject.add(internalElements);
            }
        }
        return arraylistObject;
    }
}