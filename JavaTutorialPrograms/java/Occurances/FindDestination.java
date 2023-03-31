package Occurances;
import java.util.*;
public class FindDestination {
    public static String destinationCity(List<List<String>> listInput) {
        List<String> outElemetsList = new ArrayList<>();
        List<String> inElementsList = new ArrayList<>();
        for (List<String> list : listInput)
        {
            String outElement = list.get(0);
            String inElement = list.get(1);
            outElemetsList.add(outElement);
            inElementsList.add(inElement);
        }
        for (String stringElement : inElementsList)
        {
            String inElement = stringElement;
            if (!outElemetsList.contains(inElement)) {
                return inElement;
            }
        }
        return null;
    }
    public static void main(String args[]) {
        List<List<String>> testList = new ArrayList<>();
        List<String> listStringFirst = new ArrayList<>();
        listStringFirst.add("London");
        listStringFirst.add("New York");
        List<String> listStringSecond = new ArrayList<>();
        listStringSecond.add("New York");
        listStringSecond.add("Lima");
        List<String> listStringThird = new ArrayList<>();
        listStringThird.add("Lima");
        listStringThird.add("Sao Paulo");
        testList.add(listStringFirst);
        testList.add(listStringSecond);
        testList.add(listStringThird);
        String returnDestination = destinationCity(testList);
        System.out.println(returnDestination);
    }
}