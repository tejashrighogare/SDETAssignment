package findDestination;

import java.util.*;

public class FindDestination {
    public static void main(String args[]) {
        List<List<String>> inputCity = new ArrayList<>();
        inputCity.add(Arrays.asList("London", "New York"));
        inputCity.add(Arrays.asList("New York", "Lima"));
        inputCity.add(Arrays.asList("Lima", "Sao Paulo"));
        String returnDestination = printDestinationCity(inputCity);
        System.out.println("Destination City is : " + returnDestination);
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
            if (!outElemetsList.contains(stringElement)) {
                return stringElement;
            }
        }
        return null;
    }
}