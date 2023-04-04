package findDestination;

import java.util.*;

public class FindDestination {
    public static void main(String args[]) {
        List<List<String>> cityList = new ArrayList<>();
        List<String> listItemFirst = new ArrayList<>();
        listItemFirst.add("London");
        listItemFirst.add("New York");
        List<String> listItemSecond = new ArrayList<>();
        listItemSecond.add("New York");
        listItemSecond.add("Lima");
        List<String> listItemThird = new ArrayList<>();
        listItemThird.add("Lima");
        listItemThird.add("Sao Paulo");
        cityList.add(listItemFirst);
        cityList.add(listItemSecond);
        cityList.add(listItemThird);
        String returnDestination = printDestinationCity(cityList);
        System.out.println(returnDestination);
    }

    public static String printDestinationCity(List<List<String>> listInput) {
        List<String> outElemetsList = new ArrayList<>();
        List<String> inElementsList = new ArrayList<>();
        for (List<String> list : listInput) {
            String outElement = list.get(0);
            String inElement = list.get(1);
            outElemetsList.add(outElement);
            inElementsList.add(inElement);
        }
        for (String stringElement : inElementsList) {
            String inElement = stringElement;
            if (!outElemetsList.contains(inElement)) {
                return inElement;
            }
        }
        return null;
    }
}