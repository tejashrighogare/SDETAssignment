package Occurances;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
    public static String destinationCity(List<List<String>> paths) {
        List<String> outElemet1 = new ArrayList<>();
        List<String> inElement1 = new ArrayList<>();
        for (int i = 0; i < paths.size(); i++) {
            List<String> Elements = paths.get(i);
            String outElement = Elements.get(0);
            String inElement = Elements.get(1);
            outElemet1.add(outElement);
            inElement1.add(inElement);
        }
        for (int i = 0; i < outElemet1.size(); i++) {
            String inElement = inElement1.get(i);   //local variable
            if (!outElemet1.contains(inElement)) {
                return inElement;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        List<List<String>> testList = new ArrayList<>();
        List<String> test1 = new ArrayList<>();
        test1.add("London");
        test1.add("New York");
        List<String> test2 = new ArrayList<>();
        test2.add("New York");
        test2.add("Lima");
        List<String> test3 = new ArrayList<>();
        test3.add("Lima");
        test3.add("Sao Paulo");
        testList.add(test1);
        testList.add(test2);
        testList.add(test3);
        String returnDestination = destinationCity(testList);
// String returnDestination=testList.get(testList.size()-1).get(1);
        System.out.println(returnDestination);
    }
}
